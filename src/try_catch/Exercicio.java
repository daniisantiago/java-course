package try_catch;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			double value = sc.nextDouble();
			acc.withdraw(value);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch(DomainException e ) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
				
		sc.close();
	}

}