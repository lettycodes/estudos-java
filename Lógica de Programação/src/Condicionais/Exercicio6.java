/*Encontrar o dobro de um número caso ele seja positivo e o seu triplo 
 caso seja negativo, imprimindo o resultado.*/

package Condicionais;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {

		int numero, resultado;
	
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
	
		if (numero > 0) {
	
			resultado = numero * 2;
			System.out.println("Você digitou um número positivo. \nO dobro desse número é: " + resultado);
		}
	
		else if (numero < 0) {
	
			resultado = numero * 3;
			System.out.println("Você digitou um número negativo. \nO triplo desse número é: " + resultado);
		} else {
			System.out.println("Você digitou 0, esse número não é positivo e nem negativo.");
		}
	}
}
