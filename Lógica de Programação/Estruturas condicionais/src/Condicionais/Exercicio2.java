/*Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo*/

package Condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numDigitado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numDigitado = leia.nextInt();

		if (numDigitado <= 0) {
			System.out.println("O valor digitado é negativo.");
		} else {
			System.out.println("O valor digitado é positivo.");
		}

	}

}
