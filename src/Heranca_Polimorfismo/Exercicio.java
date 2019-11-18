package Heranca_Polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Exercicio {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		List<Produto> produtos = new ArrayList<>();
		Produto p = new Produto();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(tipo == 'i') {
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				p = new ProdutoImportado(name, price, customs);
			}else if(tipo == 'u') {
				System.out.print("Manufacture data (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				p = new ProdutoUsado(name, price, manufactureDate);
			}else {
				p = new Produto(name, price);
			}
			produtos.add(p);
		}
		
		System.out.println("\nPRICE TAGS:");
		for(Produto item : produtos) {
			System.out.println(item.priceTag());
		}
		
		sc.close();
	}

}
