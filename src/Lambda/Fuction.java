package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.Product;

public class Fuction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("Mouse", 50.0));
		
		//coloca todos os nomes em caixa alta
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		//percorre a lista e imprime os valores
		names.forEach(System.out::println);

	}

}
