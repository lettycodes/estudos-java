# Estudos Java

Neste repositório você encontrará anotações e exercícios sobre a linguagem Java.

## Java e sua história
Interessada em dispositivos eletrônicos inteligentes, a Sun Microsystems financiou uma pesquisa interna com o codinome Green em 1991. O projeto resultou no desenvolvimento de uma linguagem baseada em C e C++ que seu criador, James Gosling, chamou de Oak (carvalho) em homenagem a uma árvore que dava para a janela do seu escritório na Sun.

Descobriu-se mais tarde, que já havia uma linguagem de computador chamada Oak. Quando uma equipe da Sun visitou uma cafeteria local, o nome Java (cidade de origem de um tipo de café importado) foi sugerido e pegou.

Mas o projeto Green atravessava algumas dificuldades. O mercado para dispositivos eletrônicos inteligentes destinados ao consumidor final, não estava se desenvolvendo tão rapidamente como a Sun tinha previsto. Pior ainda, um contrato importante pelo qual a Sun competia fora concedido a outra empresa. Então, o projeto estava em risco de cancelamento. Por pura sorte, a World Wide Web explodiu em popularidade em 1993 e as pessoas da Sun viram o imediato potencial de utilizar Java para criar páginas da Web com o chamado conteúdo dinâmico. Isso deu nova vida ao projeto.

Em maio de 1995, a Sun anunciou Java formalmente em uma conferência importante. Normalmente, um evento como esse não teria gerado muita atenção. Entretanto, Java gerou interesse imediato na comunidade comercial, por causa do fenomenal interesse pela World Wide Web.

## O que é o Java?
O Java, como plataforma de programação, nasceu no ano de 1995 dentro dos laboratórios da empresa Sun Microsystem como resultado de uma extensa pesquisa científica e tecnológica. A plataforma Java entrega um ambiente completo para o desenvolvimento e execução de programas, sendo composta por:

- Uma linguagem de programação de alto nível orientada a objetos;
- Máquina Virtual (Java Virtual Machine ou JVM), que garante independência de plataforma, pois o código executa na máquina virtual e essa pode ser portada para outras plataformas como Windows ou Linux;
- Java Runtime Environment ou JRE, que agrega a máquina virtual e alguns recursos para a execução de aplicações Java; e
- Java Development Kit ou JDK, que é um conjunto de utilitários que oferece suporte ao desenvolvimento de aplicações.

No Java, os programas são escritos em um arquivo com a extensão .java, que em um processo posterior serão compilados para arquivos com a extensão .class. Esses, por sua vez, contêm os códigos a serem executados na máquina virtual, os bytecodes.
A JVM está disponível para a maioria dos sistemas operacionais do mercado, sendo assim conseguimos rodar a mesma aplicação Java no Windows, macOS, Linux, Solaris, entre outros. Essa funcionalidade implementa um dos conceitos que nasceram forte com o Java: “escreva uma vez e execute em qualquer lugar!”.

## Mais sobre o Java
A Linguagem Java é composta por um conjunto bem definido de funcionalidades (features) que são super recomendadas para você entusiasta em programação conhecer o máximo que puder.
<img src="https://imgur.com/MC2GzFg.png">

### Simples
Java é uma linguagem de programação simples e fácil de entender, pois não contém complexidades que existiam em linguagens de programação anteriores. Na verdade, a simplicidade era o objetivo do design dos povos Javasoft, porque ele tem que funcionar em dispositivos eletrônicos onde menos memória/recursos estão disponíveis.

### Orientada a Objeto
Java é uma linguagem de Programação Orientada a Objetos. Isso significa que em Java tudo é escrito em termos de CLASSES e OBJETOS. Para começar a desenvolver softwares de forma consistente com Java, é necessário compreender os pilares da Programação Orientada a Objetos (POO). Eles são:
1. Classe e Objeto;
2. Encapsulamento;
3. Abstração;
4. Herança;
5. Polimorfismo.

### Plataforma independente
O objetivo de design do javasoft people é desenvolver uma linguagem que funcione em qualquer plataforma. Uma plataforma é o ambiente de hardware ou software no qual um programa é executado. 
Em Java, o código-fonte Java é compilado para bytecode e esse bytecode não está vinculado a nenhuma plataforma.

### Portátil
O conceito WORA (Write Once Run Anywhere) e o recurso independente de plataforma tornam o Java portátil. Agora, usando a linguagem de programação Java, os desenvolvedores podem obter o mesmo resultado em qualquer máquina, escrevendo o código apenas uma vez. A razão por trás disso é JVM e bytecode. 

### Robusta
A linguagem de programação Java é robusta, o que significa que é capaz de lidar com o encerramento inesperado de um programa. 
- Ele usa um gerenciamento de memória forte;
- Java fornece coleta de lixo automática;
- Há tratamento de exceção e mecanismo de verificação de tipo em Java.

### Segura
Problemas como ameaças de vírus, adulteração, espionagem ou representação podem ser tratados ou minimizados usando Java. E nossa construção de aplicativo usando Java também precisa de algum tipo de segurança. Por isso, a linguagem também fornece recursos de segurança para os programadores. Também existem Recursos de criptografia e decriptografia para proteger seus dados contra espionagem e adulteração na Internet.

### Interpretada
Nas linguagens de programação, você aprendeu que eles usam o compilador ou o interpretador, mas a linguagem de programação Java usa os dois. Os programas Java são compilados para gerar arquivos de bytecode e a JVM (Java Virtual Machine) interpreta o arquivo de bytecode durante a execução.

### Multi-thread
Thread é um subprocesso leve e independente de um programa em execução (ou seja, processo) que compartilha recursos. Multi-threading é o nome dado ao processo de vários threads sendo executados simultaneamente.

## Onde podemos utilizar o Java?
Em praticamente tudo:
- Páginas da Web com conteúdo interativo e dinâmico;
- Aplicações corporativas de grande porte;
- Softwares destinados ao consumidor final.
- Aplicativos para Smartphones.

## Plataformas
Com a linguagem Java, conseguimos desenvolver softwares para várias finalidades de negócio. Seja uma aplicação desktop, uma distribuição web, eletrônicos e dispositivos móveis.

Isso graças a distribuição dos recursos da linguagem, através de plataformas bem estruturadas.

### Plataformas da linguagem Java
A linguagem Java conta com quatro ambientes de desenvolvimento:
- JSE (Java Standard Edition): É a base da plataforma. Inclui o ambiente de execução e as bibliotecas comuns, sendo direcionado a aplicações para PCs e servidores. O toolkit Swing, por exemplo, é usado para desenvolver softwares com interface gráfica para desktop.
- JEE (Java Enterprise Edition): A edição voltada para o desenvolvimento de aplicações corporativas e para a Web. Possui diversos frameworks, como JPA (Java Persistence API), JSP (Java Server Pages), etc.
- JME (Java Micro Edition): É a edição para o desenvolvimento de aplicações para dispositivos móveis e embarcados.
- JFX (Java FX): JavaFX é uma tecnologia de software que, ao ser combinada com Java, permite a criação e implantação de aplicações de aparência moderna e conteúdo rico de áudio e vídeo.

## Componentes da plataforma
Agora que já sabemos que podemos desenvolver para vários cenários de negócio, é hora de conhecer as ferramentas de desenvolvimento da linguagem:

O Java se subdivide em componentes de desenvolvimento (JDK) e de execução (JRE). Isso significa que, para desenvolver aplicações, é necessário ter instalado o JDK. Mas para apenas iniciar o executável (.jar), simplesmente a instalação da JRE será o suficiente.

### JDK (Java Development Kit) - Kit de Desenvolvimento Java
- Composto pelo compilador (javac + JVM);
- Visualizador de applets, bibliotecas de desenvolvimento;
- Programa para composição de documentação (javadoc);
- Depurador básico de programas e versão da JRE.

### JRE (Java Runtime Environment) - Ambiente de Execução Java
- É composta de uma JVM e por um conjunto de bibliotecas, que permite a execução de softwares em Java;
- Apenas permite a execução de programas, ou seja, é necessário o programa Java compilado pela JDK gerando os arquivos .class.

## Processo de desenvolvimento
- Todo código-fonte escrito em arquivo texto possui extensão .java;
- Este arquivo é compilado com o javac gerando o arquivo .class;
- O arquivo .class não contém código de máquina nativo, e sim o bytecodes.

## JVM - Java Virtual Machine
Máquina virtual Java (em inglês: Java Virtual Machine, JVM) é um programa que carrega e executa os aplicativos Java, convertendo os bytecodes em código executável de máquina. A JVM é responsável pelo gerenciamento dos aplicativos, à medida que são executados.

Graças à máquina virtual Java, os programas escritos em Java podem funcionar em qualquer plataforma de hardware e software que possua uma versão da JVM, tornando assim, essas aplicações independentes da plataforma onde funcionam.

-------
Referências: Alura, glysns.