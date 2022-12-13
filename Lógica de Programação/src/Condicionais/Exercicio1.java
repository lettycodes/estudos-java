/*Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles*/  



package Condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		num1 = leia.nextInt();
		
		System.out.println("Digite outro número:");
		num2 = leia.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número digitado foi: "+num1);
		} else {
			System.out.println("O maior número digitado foi: "+num2);
		}

	}

}
