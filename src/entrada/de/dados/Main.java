package entrada.de.dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//para passar ponto ao inves de virgula importar o Locale
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String nome;
		//lendo uma string
		nome = sc.next();
		
		System.out.print("Digite sua idade: ");

		int idade;
		idade = sc.nextInt();
		
		System.out.print("Digite sua altura: ");
		
		double alt;
		alt = sc.nextDouble();
		
		System.out.print("Digite seu genero(F or M): ");
		char sex;
		sex = sc.next().charAt(0);
		
		
		//leitura de varios dados na mesma linha separados por espaço
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}

}
