package vetores;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class vetor2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] produto = new Product[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine(); 
			double price = sc.nextDouble(); 
			produto[i] = new Product(nome, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += produto[i].getPrice();
		}
		
		System.out.printf("Average Price = %.2f", sum/n);
		
		sc.close();
	}
	
}
