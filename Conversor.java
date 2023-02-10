package conversor;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		int opcao;
		float valorConversorUm, valorConversorDois, conversorUm, conversorDois;

		do {
			System.out.println("  ---------------  MENU  ----------------  ");
			System.out.println("  ------ Versão do Conversor - 1.0 ------  ");
			System.out.println("  ---------------------------------------  ");
			System.out.println("Digite nº 1 - Converter quilômetros em metros");
			System.out.println("Digite nº 2 - Converter litros em metros cúbicos");
			System.out.println("Digite nº 3 - Sair do conversor");
			System.out.println("  ----------------------------------------");

			Scanner entradaUsuario = new Scanner(System.in);

			opcao = entradaUsuario.nextInt();

			if (opcao == 1) {
				System.out.println("Digite os quilômetro(s) a serem convertidos em metros : ");
				valorConversorUm = entradaUsuario.nextFloat();
				conversorUm = (valorConversorUm * 1000);
				System.out.println(" ");
				System.out.println(valorConversorUm + " quilômetro(s) são equivalentes a: " + conversorUm + " metros");

			}
			if (opcao == 2) {
				System.out.println("Digite os litros a serem convertido em metros cúbicos : ");
				valorConversorDois = entradaUsuario.nextFloat();
				conversorDois = (valorConversorDois / 1000);
				System.out.println(
						valorConversorDois + " litro(s) são equivalente a: " + conversorDois + " metros cúbicos");
				System.out.println(" ");

			}
			if (opcao == 3) {
				System.out.println("...Encerrado o conversor...\n");
				System.out.println(">>>>>  Agradecemos pela sua atenção!  <<<<<");
			}
			if (opcao > 3 || opcao < 1) {
				System.out.println("Opção inválida!Retorne as opções do menu\n");

			}
		
			
		} while (opcao != 3);

	}

}
