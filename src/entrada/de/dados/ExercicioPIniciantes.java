package entrada.de.dados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPIniciantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercicio 1: soma entre dois numeros		
		int a , b, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a+b;
		System.out.println("SOMA = " + soma);

		/*Exercicio 2: valor da area de um circulo com quatro casas decimais
		formula da area: area = pi .raio elevado 2*/		
		double pi = 3.14159;
		double raio, area;
		
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		System.out.printf("A=%.4f", area);
		
		
		//Exercico 3: calcular a diferença entre produtos DIFERENCA = (A*B - C*D)		
		int x,y,z,w, dif;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		w = sc.nextInt();
		
		dif = (x*y) - (z*w);
		System.out.println("DIFERENCA = " + dif);
		
		
		/*Exercicio 4 : ler o numero de um funcionario, seu numero de horas trabalhadas,
		 o valor que recebe por hora e calcula o salario desse funcionario
		 mostrar o salario do funcionario com duas casas decimais*/
		int fun, horas;
		double valor, salario;
		fun = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = valor * (double)horas;
		System.out.println("NUMBER = " + fun);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		/*Exercicio 5: ler o codigo de uma peça 1, o numero de peças 1, o valor unitario de
		cada peça 1, o codigo de uma peça 2, o numerol de peças 2 e o valor unitario
		de cada peça 2. Calcule e moste o valor a ser pago.*/
		int cd1, n1, cd2, n2;
		double v1, v2, total;
		
		cd1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		cd2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		total = ((double)n1 * v1) + ((double)n2 * v2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		
		/*Exercico 6: ler 3 valores com ponto flutuante de dupla precisao: A, B e C
		  Em seguida, calcule e mostre:
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B. */
		
		float A, B, C;
		double result;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		result = (double) (A * C)/2;
		System.out.printf("TRIANGULO: %.3f%n", result);
		
		result = (double) pi * Math.pow(C, 2.0);
		System.out.printf("CIRCULO: %.3f%n", result);
		
		result = (double) ((A + B) * C)/2;
		System.out.printf("TRAPEZIO: %.3f%n", result);
		
		result = Math.pow((double)B, 2.0);
		System.out.printf("QUADRADO: %.3f%n", result);
		
		result = (double) A * B;
		System.out.printf("RETANGULO: %.3f%n", result);
		
		sc.close();
	}

}
