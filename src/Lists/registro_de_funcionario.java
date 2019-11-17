package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class registro_de_funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> funcionario = new ArrayList<Employee>();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee fun = new Employee(id, name, salary);
			funcionario.add(fun);			
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id_aumento = sc.nextInt();
		Employee promovido = funcionario.stream().filter(x -> x.getId() == id_aumento).findFirst().orElse(null);
		if( promovido != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			promovido.increaseSalary(percentage);
		}else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("\nList of employees:");
		//imprimindo os elementos da lista
		for(Employee e : funcionario) {
			System.out.printf("%d, %s, %.2f%n", e.getId() , e.getName() , e.getGrossSalary());
		}
		sc.close();
	}

}
