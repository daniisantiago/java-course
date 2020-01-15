package Generics;

import java.util.Arrays;
import java.util.List;

public class TipoCoringa {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		System.out.println();
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
		//conseguimos imprimir uma lista de inteiros e uma de strings chamando o mesmo metodo

	}
	
	//metodo coringa
	public static void printList(List<?> list) {
		//porem vc não pode add elementos nessa lista
		//list.add(3) ----> vai dar erro
		for(Object obj: list) {
			System.out.println(obj);
		}
	}

}
