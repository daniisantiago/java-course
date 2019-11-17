package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class aluguel_de_quartos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] rent = new Rent[10];
		
		for(int i = 0; i < n; i++) {			
			sc.nextLine();
			System.out.println("\nRent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < rent.length; i++){
			if(rent[i] != null)
				System.out.println(rent[i].toString());
		}

	}

}
