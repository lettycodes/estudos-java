/*Faça um programa que receba a idade de dez pessoas e que calcule e mostre 
a quantidade de pessoas com idade maior ou igual a 18 anos*/

package Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int idade, quant = 0;
        
        Scanner leia = new Scanner(System.in);
 
        for (int i = 1; i <= 10; i++) {
 
        	System.out.println("Informe a idade da pessoa: ");
        	idade = leia.nextInt();
 
            if (idade >= 18) {
            	quant = quant + 1;
            }
        }
 
        System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é de: " +quant);
    }

}