package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + p.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		
		System.out.println("\nUpdated data: " + p.toString());
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		
		System.out.println("\nUpdated data: " + p.toString());
		
		sc.close();
		
	}

}
