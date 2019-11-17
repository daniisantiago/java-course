package entrada.de.dados;

import java.util.Scanner;

public class QuebraDeLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ler um texto ate a quebra de linha
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
