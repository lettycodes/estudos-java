/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres
*/

package Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int numMulheres = 0, numHomens = 0;
		char genero;
		float maiorAltura = 0, menorAltura = 0, mediaAlturaH = 0, altura, somaAltura = 0;

		Scanner leia = new Scanner(System.in);

		for (int x = 1; x <= 3; x++) {
			System.out.println("Insira o seu gênero (M/F): ");
			genero = leia.next().charAt(0);

			System.out.println("Digite sua altura: ");
			altura = leia.nextFloat();

			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura > menorAltura) {
				menorAltura = altura;
			}

			if (genero == 'M') {
				numHomens++;
				somaAltura += altura;
			} else if (genero == 'F') {
				numMulheres++;
			} else {
				System.out.println("Opção inválida, digite 'M' ou 'F'");
			}
		}
		
		mediaAlturaH = somaAltura / numHomens;
		
		System.out.println("A maior altura foi: "+maiorAltura);
		System.out.println("A menor altura foi: "+menorAltura);
		System.out.println("A média de altura dos homens foi: "+mediaAlturaH);
		System.out.println("A quantidade de mulheres foi: "+numMulheres);

	}

}
