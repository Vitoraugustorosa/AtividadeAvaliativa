package senai.avaliativo.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import senai.aluno.com.Aluno;
import senai.aluno.com.AlunoController;
import senai.curso.com.Curso;
import senai.curso.com.CursoController;

public class ProgamaPrincipal {

	public static class Menus {
		static Scanner in = new Scanner(System.in);

		public int Opcao() {
			System.out.println("Digite: ");
			return in.nextInt();

		}

		public static void pricipalDosMenus() {
			System.out.println("---------------------------------------------");
			System.out.println(" OPÇÕES DISPONIVEIS PARA SELECIONAR ");
			System.out.println("1- SELECIONAR OPÇÕES DE CURSOS");
			System.out.println("2 - SELECIONAR OPÇÕES DE ALUNOS");
			System.out.println("9 - SAIR DAS OPÇÕES");
			System.out.println("---------------------------------------------");

			System.out.println("Informe a opção: ");

		}

		public static void main(String[] args) {
			List<Aluno> alunos = new ArrayList<>();
			List<Curso> cursos = new ArrayList<Curso>();

			AlunoController alunoController = new AlunoController();
			CursoController cursoController = new CursoController();

			boolean sair = false;

			do {
				pricipalDosMenus();
				int opcao = in.nextInt();

				switch (opcao) {
				case 1:
					cursoController.CursoMenu(cursos, alunos);
					break;
				case 2:
					alunoController.menuAluno(alunos, cursos);
					break;
				case 9:
					System.out.println("Sistema finalizado");
					break;
				default:
					System.out.println("Não existe esta opção");
				}

			} while (!sair);
			System.out.println("sSistema finalizado");

		}
	}
}
