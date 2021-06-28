package senai.avaliativo.com;

import java.util.Scanner;

public class Menus {
	private Scanner in = new Scanner(System.in);
	
	public int Opcao() {
		System.out.println("Digite: ");
		return in.nextInt();
	}
	
	public void pricipalDosMenus() {
		System.out.println("\n--- OP합ES DISPONIVEIS PARA SELECIONAR ---");
		System.out.println("1- SELECIONAR OP합ES DE ALUNOS");
		System.out.println("2 - SELECIONAR OP합ES DE CURSOS");
		System.out.println("9 - SAIR DAS OP합ES");
		System.out.println("---------------------------------------------");
	}
}
