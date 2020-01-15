package set;

import java.util.HashSet;
import java.util.Set;

import model.entities.Product;

public class Comparando {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		
		/*Se o hashCode e equals não estiverem implementados 
		 *os objetos vão ser comparados pelas referencias (ponteiros) dos objetos.
		 * 
		 * Para que a comparação de certo, seria necessario implementar o hashCode
		 * e o equals na classe que está sendo usada.
		 * */

	}

}
