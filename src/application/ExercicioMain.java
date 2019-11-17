package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class ExercicioMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*EXERCICIO 1:
		 * Fazer um programa para ler os valores da largura e altura de um retangulo. Em seguida, mostrar na tela
		 * o valor de sua área, perimetro, e diagonal. Usar uma classe.
		 */
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f", retangulo.diagonal());
		
		
		/*EXERCICIO 2:
		 * Fazer um programa para ler os dados de um funcionario (nome, salario bruto e imposto). Em seguida,
		 * mostrar os dados do funcionario (nome e salario liquido). Em seguida, aumentar o salario do 
		 * funcionario com base em uma porcentagem dada (somente o salario bruto é afetado pela porcentagem) 
		 * e mostrar novamente os dados do funcionario. Use uma classe.
		 */
		
		Employee funcionario = new Employee();
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + funcionario.toString());
		
		System.out.print("\nWhich percentage to increase salary? ");
		funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println("\nUpdate data: " + funcionario.toString());
		
		
		/*EXERCICIO 3:
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três 
		 * trimestres do ano (primeiro trimeste vale 30 e o segundo e terceiro valem 35 cada). Ao final,
		 * mostrar qual a noita final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou 
		 * não (FAILED) e, em casa negativo, quantos pontos faltam para o aluno obter o minimo para ser aprovado
		 * (que é 60% da nota). Voce deve criar uma classe Studente para resolver este problema.
		 */
		
		Student estudante = new Student();
		estudante.name = sc.nextLine();
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();
		
		System.out.println(estudante.toString());
		System.out.println(estudante.situation());
		
		sc.close();

	}

}
