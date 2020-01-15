package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import model.entities.Course;

public class ExercicioProposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Course> set = new HashSet<>();
		
		String [] cursos = new String[] {"A", "B", "C"};
		
		for(String c : cursos) {
			System.out.print("How many students for course " + c + "? ");
			int n = sc.nextInt();
			
			while(n > 0) {
				int id = sc.nextInt();
				set.add(new Course(id));
			
				n--;
			}
		}
		System.out.println("Total students: " + set.size());
		sc.close();
	}

}
