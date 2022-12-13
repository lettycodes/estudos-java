# O que é lógica de programação?

Lógica de programação é a organização coesa de uma sequência de instruções voltadas à resolução de um problema, ou à criação de um software ou aplicação.

A lógica de programação é o conhecimento anterior a qualquer outro quando falamos em desenvolvimento web porque é a partir dele que os aprendizados posteriores, como por exemplo o das linguagens de programação, farão sentido.

Cada linguagem tem suas próprias particularidades, como sua sintaxe, seus tipos de dados e sua orientação, mas a lógica por trás de todas é a mesma.

Em outras palavras, dominar a lógica de programação é a porta de entrada para tornar-se um programador completo, seja em front-end ou em back-end.

## Classificação: 
- Estruturas condicionais: if-else, switch-case.
- Estruturas de repetição: for, while, do-while.
- Estruturas de exceções: try-catch-finally, throw.

## Estrutura Condicional Simples

A Estrutura Condicional Simples executa um comando ou vários comandos se a condição for verdadeira. Se a condição for falsa, a estrutura é finalizada sem executar os comandos. O comando que define a estrutura é representado pela palavra if.

### Exemplo

Vamos imaginar que temos R$25,00 na nossa conta bancária, e tentamos sacar R$ 17,00. A transação vai ser bem sucedida, já que nosso saldo é maior do que o valor que queremos sacar. 

```javascript
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
```

## Estrutura Condicional Composta

A Estrutura Condicional Composta segue o mesmo princípio da Estrutura Condicional Simples, com a diferença de que quando a condição não é satisfeita, será executado o outro comando. O comando que define a estrutura é representado pelas palavras if e else.

### Exemplo

Vamos imaginar um cenário escolar, o aluno precisa tirar nota 7 ou mais para passar de ano, caso contrário, ele será reprovado.

```javascript
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
    }
}
```

## Condicionais encadeadas
Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.

### Exemplo

Ainda seguindo o cenário escolar, podemos criar uma condição para o aluno não ser reprovado diretamente, e assim podemos colocar a condição de que, se ele tirar uma nota igual a 5 e menor que 7, ele ficará de recuperação, e só se a nota for menor que 5, ele será reprovado.

```javascript
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
```

-----

Referências: Kenzie, Senac, glysns.