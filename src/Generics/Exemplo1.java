package Generics;

import java.util.Scanner;

import model.services.PrintService;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//instanciando um tipo generics
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
