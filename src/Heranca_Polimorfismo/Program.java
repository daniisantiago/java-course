package Heranca_Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee_;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee_> employees = new ArrayList<Employee_>();
		Employee_ employee = new Employee_();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsoursed (y/n)? ");
			char outsoursed = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(outsoursed == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}else {
				employee = new Employee_(name, hours, valuePerHour);
			}
			employees.add(employee);
		}
		
		System.out.println("\nPAYMENTS: ");
		for(Employee_ e : employees) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		sc.close();
	}
}
