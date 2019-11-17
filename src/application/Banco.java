package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value;
		Conta account = new Conta();
		
		System.out.print("Enter account number: ");
		String number = sc.nextLine();
		System.out.print("Enter acoount holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble(); 
			account  = new Conta(number, holder, value);
		}else {
			account = new Conta(number, holder);
		}
		
		System.out.println("\nAccount data:\n" + account.toString());
		
		System.out.print("\nEnter a deposit value: ");
		value = sc.nextDouble();
		
		account.deposito(value);
		System.out.println("Update account data:\n" + account.toString());
		
		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		account.saque(value);
		System.out.println("Update account data:\n" + account.toString());
		
		sc.close();

	}

}
