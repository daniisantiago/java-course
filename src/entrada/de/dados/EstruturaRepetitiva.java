package entrada.de.dados;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int novo = sc.nextInt();
			sum += novo;
		}
		System.out.println(sum);
		
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double temperatura = sc.nextDouble();
			temperatura = (9 * temperatura) / 5 + 32;
			System.out.println("Equivalente em Fahrenheit: " + temperatura);
			System.out.println("Deseja repetir (s/n)? ");
			resp  = sc.next().charAt(0);
		} while (resp != 'n');
		
	
		sc.close();
		
		

	}

}
