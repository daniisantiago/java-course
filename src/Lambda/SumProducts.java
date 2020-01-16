package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.ProductService;

public class SumProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Mouse", 50.00));
		
		ProductService ps = new ProductService();
		
		//percorre a lista e soma os valores dos produtos que começam com a letra T
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum: " + String.format("%.2f", sum));
	}

}
