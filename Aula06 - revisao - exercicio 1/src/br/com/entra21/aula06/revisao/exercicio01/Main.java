package br.com.entra21.aula06.revisao.exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa que:\r\n"
				+ "Defina como constante a altura minima permitida para entrar em um brinquedo (Aten��o a nomenclatura e utilize a constante no IF)\r\n"
				+ "Capture nome e altura do usu�rio\r\n" + "Validar se a altura informada � MENOR que a permitida\r\n"
				+ "Caso seja MENOR informar de forma educada mencionando o nome do usu�rio e sua altura qual o par�metro minimo para entrar no brinquedo\r\n"
				+ "Caso n�o seja MENOR informar que a entrada est� liberada.");
		
		System.out.println("================================================");
		final float ALTURA_MINIMA=1.5f;
		String nome;
		float altura;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("informe o seu nome:");
		nome = entrada.nextLine();
		
		System.out.println(nome+", informe sua altura:(exemplo 1,8)");
		altura= entrada.nextFloat();
		
		if(altura < ALTURA_MINIMA) {
			System.out.println(nome+", infelizmente voc� n�o atende ao requisito minimo de altura que � "+ALTURA_MINIMA);
		}else {
			System.out.println(nome+", como a altura minima � "+ALTURA_MINIMA+" sua entrada est� liberada");
			
		}
		
		

	}

}
