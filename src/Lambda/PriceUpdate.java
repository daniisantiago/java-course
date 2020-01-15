package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class PriceUpdate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("Mouse", 50.0));
		
		//percorre a lista e adiciona 10% ao valor
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		//percorre a lista e imprime os valores
		list.forEach(System.out::println);

	}

}
