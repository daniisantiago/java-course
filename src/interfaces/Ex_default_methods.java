package interfaces;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;
import model.services.UsaInterestService;

public class Ex_default_methods {

	//usando interfaces com default methods
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		//InterestService is = new BrazilInterestService(2.0);
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();

	}

}
