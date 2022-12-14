/*Uma loja deseja cadastrar 5 clientes e verificar se o faturamento da loja foi superior 
 a loja B (faturamento = 54000).  Se o faturamento atingir esse valor mostre na tela
 uma mensagem contendo em quanto foi superado o faturamento*/

package Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int cliente= 0, faturamento=0, valor=0;
		float valorSuperado;
		
		Scanner leia = new Scanner(System.in);
		
		while (cliente < 5) {
			System.out.println("Digite o valor da compra: ");
			valor = leia.nextInt();
			faturamento =+ valor;
			cliente += 1;
			valorSuperado = valor - 54000;
			
			if (faturamento > 54000) {	
				
				System.out.println("O faturamento da loja B superou a loja A em: "+valorSuperado);
			} else {
				System.out.println("O faturamento dessa loja não superou o da loja A.\n");
			}
		} 

	}

}
