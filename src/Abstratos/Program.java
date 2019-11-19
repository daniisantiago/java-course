package Abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape> shape = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(tipo == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shape.add(new Retangulo(color, width, height));
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shape.add(new Circulo(color, radius));
			}
		}
		
		System.out.println("\nSHAPE AREAS:");
		for(Shape s : shape) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();

	}

}
