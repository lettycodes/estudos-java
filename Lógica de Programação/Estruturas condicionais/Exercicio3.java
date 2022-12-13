/*5- Faça um programa para a leitura de duas notas parciais de um aluno.  

A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
A mensagem “Aprovado com Distinção”, se a média for igual a dez;
A mensagem “Reprovado” se a média for menor de do que sete.*/


package Condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int nota1, nota2;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a segunda nota do aluno:");
		nota2 = leia.nextInt();
		
		media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção! Parabéns! \nNota final: "+media);
		} else if (media >= 7) {
			System.out.println("Aluno aprovado! Parabéns! \nNota final: "+media);
		} else {
			System.out.println("Aluno reprovado. Continue estudando. \nNota final: "+media);
		}
	}

}
