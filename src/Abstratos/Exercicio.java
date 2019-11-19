package Abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number od tax payers: ");
		int n = sc.nextInt();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if(tipo == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}else {
				System.out.print("Number of employees: ");
				int funcionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}			
		}
		
		double sumTaxs = 0.0;
		System.out.println("\nTAXES PAID:");
		for(Pessoa p : pessoas) {
			sumTaxs += p.calcularImposto();
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.calcularImposto()));
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sumTaxs));
		
		sc.close();
	

	}

}
