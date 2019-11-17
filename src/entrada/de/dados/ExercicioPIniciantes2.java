package entrada.de.dados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPIniciantes2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Exercicio 1: fazer um programa para ler um numero interio depois dizer se
		 * este numero é negativo ou nao.
		 */

		int n;
		n = sc.nextInt();
		if (n >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		//Exercico 2: ler um programa e dizer se este numero é par ou impar

		int n2;
		n2 = sc.nextInt();
		if (n2 % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		/*
		 * Exercico 3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
		 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
		 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
		 * em ordem crescente ou decrescente.
		 */

		int n3, n4;
		n3 = sc.nextInt();
		n4 = sc.nextInt();

		if (n3 > n4) {
			int aux = n4;
			n4 = n3;
			n3 = aux;
		}
		if (n4 % n3 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		/*
		 * Exercicio 4: Leia a hora inicial e a hora final de um jogo. A seguir calcule
		 * a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em
		 * outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		int horaInicial, horaFinal, duracao;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		duracao = 0;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		/*
		 * Exercicio 5:Com base na tabela abaixo, escreva um programa que leia o código
		 * de um item e a quantidade deste item. A seguir, calcule e mostre o valor da
		 * conta a pagar
		 */

		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double conta = 0;

		if (codigo == 1) {
			conta = 4.0 * qtd;
		} else if (codigo == 2) {
			conta = 4.5 * qtd;
		} else if (codigo == 3) {
			conta = 5.0 * qtd;
		} else if (codigo == 4) {
			conta = 2.0 * qtd;
		} else {
			conta = 1.5 * qtd;
		}

		System.out.printf("Total: R$ %.2f%n", conta);

		/*
		 * Exercicio 6:Você deve fazer um programa que leia um valor qualquer e
		 * apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25],
		 * (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não
		 * estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de
		 * intervalo”
		 */

		double val = sc.nextDouble();
		if (val < 0.0 || val > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (val <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (val <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (val <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		/*
		 * Exercicio 7: Leia 2 valores com uma casa decimal (x e y), que devem
		 * representar as coordenadas de um ponto em um plano. A seguir, determine qual
		 * o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
		 * cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a
		 * mensagem “Origem”.Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou
		 * “Eixo Y”, conforme for a situação.
		 */

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		/*
		 * Exercicio 8: Leia um valor com duas casas decimais, equivalente ao salário de
		 * uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa
		 * deve pagar de Imposto de Renda, segundo a tabela abaixo. Lembre que, se o
		 * salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
		 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de
		 * Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$
		 * 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve
		 * ser impresso com duas casas decimais.
		 */
		
		double salario = sc.nextDouble();
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
	}

}
