package senai.curso.com;

import java.util.List;
import java.util.Scanner;

import senai.aluno.com.Aluno;

public class CursoController {
	private Scanner in;

	public CursoController() {
		in = new Scanner(System.in);
	}

	public Curso cadastrarCurso() {
		System.out.println("Cadastro de cursos");

		Curso curso = new Curso();

		System.out.println("Infome o nome curso: ");
		String nome = in.next();

		System.out.println(" Cadastrou Curso");
		return curso;

	}

	public List<Curso> ListarCursos(List<Curso> cursos) {

		if (cursos.isEmpty()) {
			System.out.println(" Não há cursos cadastrados ");
			return cursos;
		}

		System.out.println("Cursos cadastrados");
		System.out.printf("| %3s | %15s |\n", "ID", "Nome Do Curso");

		for (int i = 0; i < cursos.size(); i++) {
			System.out.printf("| %3d | %15s |\n", i + 1, cursos.get(i).getNomeDoCurso());
		}
		return cursos;

	}

	public List<Curso> EditarCurso(List<Curso> cursos) {
		if (cursos.isEmpty()) {
			System.out.println(" Não há cursos cadastrados ");
			return cursos;
		}
		ListarCursos(cursos);
		Curso curso = new Curso();

		System.out.println(" Editar Curso");

		System.out.print("Digite ID curso para editar: ");
		int IDcurso = in.nextInt() - 1;

		System.out.print("\nInforme o novo nome do curso: ");
		curso.setNomeDoCurso(in.nextLine());

		cursos.set(IDcurso, curso);

		System.out.println("Nome do curso alterado");
		return cursos;
	}

	public void ExcluirCurso(List<Curso> cursos, List<Aluno> alunos) {
		if (cursos.isEmpty()) {
			System.out.println("Não há cursos cadastrados");
			return;
		}
		ListarCursos(cursos);

		System.out.println("\n EXCLUIR CURSO");

		System.out.print("Digite ID do curso para excluir: ");
		int IDcurso = in.nextInt() - 1;

		String nomeCurso = cursos.get(IDcurso).getNomeDoCurso();

		for (int i = 0; i < alunos.size(); i++) {
			String alunoNomeCurso = alunos.get(i).getCurso();

			if (alunoNomeCurso.equals(nomeCurso)) {
				System.out.println("Não é possivel excluir ");
				return;
			}
		}
		cursos.remove(IDcurso);

		System.out.println("\n Curso foi excluido");
	}

	public void CursoMenu(List<Curso> cursos, List<Aluno> alunos) {
		System.out.println("------------------------");
		System.out.println("MENU DE CURSO");
		System.out.println("1- CADASTRAR NOVO CURSO");
		System.out.println("2- LISTAR CURSOS");
		System.out.println("3- EDITAR CURSO");
		System.out.println("4- EXCLUIR UM CURSO");
		System.out.println("-------------------------");
		System.out.println("DIGITE A OPÇÃO: ");

		int opcao = in.nextInt();

		switch (opcao) {
		case 1:
			cursos.add(cadastrarCurso());
			break;
		case 2:
			ListarCursos(cursos);
			break;

		case 3:
			EditarCurso(cursos);
			break;

		case 4:
			ExcluirCurso(cursos, alunos);
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}

	}

}
