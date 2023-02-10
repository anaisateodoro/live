package conversor;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		int opcao;
		float valorConversorUm, valorConversorDois, conversorUm, conversorDois;

		do {
			System.out.println("  ---------------  MENU  ----------------  ");
			System.out.println("  ------ Vers�o do Conversor - 1.0 ------  ");
			System.out.println("  ---------------------------------------  ");
			System.out.println("Digite n� 1 - Converter quil�metros em metros");
			System.out.println("Digite n� 2 - Converter litros em metros c�bicos");
			System.out.println("Digite n� 3 - Sair do conversor");
			System.out.println("  ----------------------------------------");

			Scanner entradaUsuario = new Scanner(System.in);

			opcao = entradaUsuario.nextInt();

			if (opcao == 1) {
				System.out.println("Digite os quil�metro(s) a serem convertidos em metros : ");
				valorConversorUm = entradaUsuario.nextFloat();
				conversorUm = (valorConversorUm * 1000);
				System.out.println(" ");
				System.out.println(valorConversorUm + " quil�metro(s) s�o equivalentes a: " + conversorUm + " metros");

			}
			if (opcao == 2) {
				System.out.println("Digite os litros a serem convertido em metros c�bicos : ");
				valorConversorDois = entradaUsuario.nextFloat();
				conversorDois = (valorConversorDois / 1000);
				System.out.println(
						valorConversorDois + " litro(s) s�o equivalente a: " + conversorDois + " metros c�bicos");
				System.out.println(" ");

			}
			if (opcao == 3) {
				System.out.println("...Encerrado o conversor...\n");
				System.out.println(">>>>>  Agradecemos pela sua aten��o!  <<<<<");
			}
			if (opcao > 3 || opcao < 1) {
				System.out.println("Op��o inv�lida!Retorne as op��es do menu\n");

			}
		
			
		} while (opcao != 3);

	}

}
