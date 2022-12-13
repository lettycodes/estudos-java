/*Faça um programa que receba um número e usando laços de repetição calcule e mostre a tabuada desse número.*/

package Repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int tabuada;

		System.out.println("Digite um número para saber a tabuada dele: ");
		tabuada = leia.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
	}

}
