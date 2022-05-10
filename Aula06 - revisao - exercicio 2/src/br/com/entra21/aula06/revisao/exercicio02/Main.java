package br.com.entra21.aula06.revisao.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que:\r\n"
				+ "Defina como constante a quantidade de notas de um aluno\r\n"
				+ "Capture nome e cada uma das notas\r\n"
				+ "Calcule a m�dia\r\n"
				+ "Informe\r\n"
				+ "se reprovou (<3)\r\n"
				+ "senao se , em recupera��o (<7)\r\n"
				+ "sen�o se, passou com a nota minima (=7)\r\n"
				+ "sen�o se, passou mas poderia ser melhor (<10)\r\n"
				+ "sen�o se, nota maxima (=10)\r\n"
				+ "sen�o (tem algo de errado com o seu calculo de m�dia)");

		System.out.println("================================================");
		final byte QTD_NOTAS = 3;
		String nome;
		float primeiraNota, segundaNota, terceiraNota, media;
		Scanner entrada = new Scanner(System.in);

		System.out.println("informe o seu nome:");
		nome = entrada.nextLine();

		System.out.println(nome + ", informe sua 1� nota:(exemplo 9,8)");
		primeiraNota = entrada.nextFloat();

		System.out.println(nome + ", informe sua 2� nota:");
		segundaNota = entrada.nextFloat();

		System.out.println(nome + ", informe sua 3� nota:");
		terceiraNota = entrada.nextFloat();

		media = (primeiraNota + segundaNota + terceiraNota) / QTD_NOTAS;

		System.out.println("Sua m�dia resultou em :"+media);
		System.out.print("Sua situa��o �: ");
		if (media < 3) {
			System.out.println("reprovado");
		} else if (media < 7) {
			System.out.println("em recupera��o"); 
		} else if (media == 7) {
			System.out.println("passou com a nota minima"); 
		} else if (media < 10) {
			System.out.println("passou mas poderia ser melhor"); 
		} else if (media == 10) {
			System.out.println("nota maxima"); 
		} else {
			System.out.println("tem algo de errado com o seu calculo de m�dia"); 
		}
	}

}
