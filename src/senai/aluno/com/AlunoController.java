package senai.aluno.com;

import java.util.List;
import java.util.Scanner;

import senai.curso.com.Curso;

public class AlunoController {
	private Scanner in;

	public AlunoController() {
		in = new Scanner(System.in);
	}

	public Aluno cadastrarAluno(List<Curso> cursos) {

		
		System.out.println("Cadastrar Alunos");

		AlunoController cursoController = new AlunoController();
		Aluno aluno = new Aluno();

		System.out.println("\n--- Dados do curso ---");

		System.out.print("Informe o Id do curso que o aluno deseja participar: ");
		int idCurso = in.nextInt() - 1;

		aluno.setCurso(cursos.get(idCurso));

		System.out.println("\n--- Dados do aluno ---");

		in.nextLine();

		System.out.print("Informe o nome: ");
		aluno.setNomeAluno(in.nextLine());

		System.out.print("Informe a idade: ");
		aluno.setIdadeAluno(in.nextInt());

		System.out.print("informe o país: ");
		in.nextLine();
		aluno.setPais(in.nextLine());

		System.out.print("Informe o estado: ");
		aluno.setEstado(in.nextLine());

		System.out.print("Informe a cidade: ");
		aluno.setCidade(in.nextLine());

		System.out.println("\nAluno Cadastrado!");

		return aluno;
	}

	public List<Aluno> listarAlunos(List<Aluno> alunos) {

		if (alunos.isEmpty()) {
			System.out.println("\nNão possui alunos cadastrados.");
			return null;
		}

		System.out.println("\n=== ALUNOS CADASTRADOS ===");

		System.out.printf("| %3s | %4s | %8s | %6s | %15s | %14s | %10s |\n", "ID", "Nome", "Idade", "País", "Estado",
				"Cidade", "Nome do Curso");

		for (int i = 0; i < alunos.size(); i++) {
			System.out.printf("| %3d | %4s | %8d | %6s | %15s | %14s | %10s |\n", i + 1, alunos.get(i).getNomeAluno(),
					alunos.get(i).getCidade(), alunos.get(i).getCurso(), alunos.get(i).getIdadeAluno(),
					alunos.get(i).getPais(), alunos.get(i).getEstado());

		}

		return alunos;
	}

	public List<Aluno> editarAluno(List<Aluno> alunos) {

		if (alunos.isEmpty()) {
			System.out.println(" Não possui alunos cadastrados ");
			return null;
		}

		listarAlunos(alunos);

		Aluno aluno = new Aluno();

		System.out.println("Editar aluno");

		System.out.print("Informe o ID de aluno para editar");
		int idAluno = in.nextInt() - 1;

		System.out.println("1 - Editar nome do aluno");
		System.out.println("2 - Editar idade do aluno");
		System.out.println("3 - Editar país do aluno");
		System.out.println("4 - Editar estado do aluno");
		System.out.println("5 - Editar cidade do aluno");

		System.out.print(" Informe o campo para ser editado: ");
		int opcao = in.nextInt();
		in.nextLine();

		switch (opcao) {
		case 1:
			System.out.println("\n--- Editar nome ---");

			System.out.print("Informe o novo nome: ");
			aluno.setNomeAluno(in.nextLine());

			aluno.setCidade(alunos.get(idAluno).getCidade());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setPais(alunos.get(idAluno).getPais());

			System.out.println("\nNome alterado.");
			break;

		case 2:
			System.out.println("\n--- Editar idade ---");

			System.out.print("Informe a nova idade: ");
			aluno.setIdadeAluno(in.nextInt());

			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			aluno.setEstado(alunos.get(idAluno).getEstado());

			System.out.println("\nIdade alterada.");
			break;

		case 3:
			System.out.println("\n--- Editar país ---");

			System.out.print("Informe o novo país: ");
			aluno.setPais(in.nextLine());

			aluno.setCidade(alunos.get(idAluno).getCidade());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());

			System.out.println("\nPaís alterado.");
			break;

		case 4:
			System.out.println("\n--- Editar estado ---");

			System.out.print("Informe o novo estado: ");
			aluno.setEstado(in.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());

			System.out.println("Alterou estado");
			break;

		case 5:
			System.out.println(" Editar cidade ");

			System.out.print("Informe a nova cidade: ");
			aluno.setCidade(in.nextLine());

			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());

			System.out.println("Cidade alterada.");
			break;

		default:
			System.out.println(" Opção Inválida!");
			break;
		}

		alunos.set(idAluno, aluno);

		return alunos;
	}

	public void excluirAluno(List<Aluno> alunos) {

		if (alunos.isEmpty()) {
			System.out.println(" Não possui alunos cadastrados");
			return;
		}

		listarAlunos(alunos);

		System.out.println(" Excluir aluno ");

		System.out.print("Informe ID de aluno para editar  ");
		int IDAluno = in.nextInt() - 1;

		if (alunos.size() <= IDAluno) {
			System.out.println("\nAluno não cadastrado.");
			return;
		}

		alunos.remove(IDAluno);

		System.out.println(" Aluno foi excluido");

	}

	public void menuAluno(List<Aluno> alunos, List<Curso> cursos) {
		System.out.println(" MENU ALUNO");
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Listar Alunos");
		System.out.println("3 - Editar Aluno");
		System.out.println("4 - Excluir Aluno");
		System.out.println("---------------------");

		System.out.print("Digite opção:  ");
		int opcao = in.nextInt();

		switch (opcao) {
		case 1:
			alunos.add(cadastrarAluno(cursos));
			break;

		case 2:
			listarAlunos(alunos);
			break;

		case 3:
			editarAluno(alunos);
			break;

		case 4:
			excluirAluno(alunos);
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}

	}
}