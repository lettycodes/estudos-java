/*Faça um algoritmo para receber um número qualquer 
 * e informar na tela se é par ou ímpar.*/

package Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {


		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("Legal! Esse número é par!");
		} else {
			System.out.println("Ah... Esse número é ímpar!");

		}

	}
}
