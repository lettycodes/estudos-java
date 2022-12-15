/*4) Faça um algoritmo que leia dois valores inteiros A e B 
 * se os valores forem iguais deverá se somar os dois, caso 
 * contrário multiplique A por B. Ao final de qualquer um dos 
 * cálculos deve-se atribuir o resultado para uma variável C 
 * e mostrar seu conteúdo na tela.*/

package Condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int a, b, c;
		
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o valor de A:");
			a = leia.nextInt();
			System.out.println("Digite o valor de B:");
			b = leia.nextInt();
			
			if(a == b) {
				
				c= a + b;
				System.out.println("Os valores digitados são iguais, então C é igual a: "+c);
			} else {
				
				c= a * b;
				System.out.println("Os valores digitados são diferentes, e multiplicando eles, o valor de C é igual a: "+c);
			}

	}

}
