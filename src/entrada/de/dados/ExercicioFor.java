package entrada.de.dados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * EXERCICIO 1: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
		 * �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.
		 */

		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		/*
		 * EXERCICIO 2: Leia um valor inteiro N. Este valor ser� a quantidade de valores
		 * inteiros X que ser�o lidos em seguida. Mostre quantos destes valores X est�o
		 * dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		 * essas informa��es conforme exemplo (use a palavra "in" para dentro do
		 * intervalo, e "out" para fora do intervalo).
		 */

		int n = sc.nextInt();
		int in = 0, out = 0;

		for (int i = 0; i < n; i++) {
			int novo = sc.nextInt();
			if (novo >= 10 && novo <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		/*
		 * EXERCICIO 3: Leia 1 valor inteiro N, que representa o n�mero de casos de
		 * teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada
		 * um deles com uma casa decimal. Apresente a m�dia ponderada para cada um
		 * destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o
		 * segundo valor tem peso 3 e o terceiro valor tem peso 5.
		 */

		int testes = sc.nextInt();

		for (int i = 0; i < testes; i++) {
			double val1 = sc.nextDouble();
			double val2 = sc.nextDouble();
			double val3 = sc.nextDouble();

			double media = (val1 * 2 + val2 * 3 + val3 * 5) / 10;
			System.out.printf("%.1f%n", media);
		}

		/*
		 * EXERCICIO 4: Fazer um programa para ler um n�mero N. Depois leia N pares de
		 * n�meros e mostre a divis�o do primeiro pelo segundo. Se o denominador for
		 * igual a zero, mostrar a mensagem "divisao impossivel".
		 */

		int entradas = sc.nextInt();

		for (int i = 0; i < entradas; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();

			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(a / b);
			}
		}

		/*
		 * EXERCICIO 5: Ler um valor N. Calcular e escrever seu respectivo fatorial.
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por
		 * defini��o, fatorial de 0 � 1.
		 */

		int N = sc.nextInt();
		int fatorial = 1;
		for (int i = 1; i <= N; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial);

		/*
		 * EXERCICIO 6: Ler um n�mero inteiro N e calcular todos os seus divisores.
		 */
		int divisores = sc.nextInt();

		for (int i = 1; i <= divisores; i++) {
			if (divisores % i == 0) {
				System.out.println(i);
			}
		}

		/*
		 * EXERCICIO 7: Fazer um programa para ler um n�mero inteiro positivo N. O
		 * programa deve ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada
		 * linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor,
		 * conforme exemplo.
		 */

		int inteiro = sc.nextInt();
		for (int i = 1; i <= inteiro; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}

		sc.close();

	}

}
