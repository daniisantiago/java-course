package hashCodeAndEquals;

import model.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "alex@gmail.com");
		Client c4 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		//so é verdadeiro quando o nome e o email sao iguais, de acordo como foi definido na implementacao do hash code e do equals na classe Client
		System.out.println(c1.equals(c4));
		System.out.println(c1.hashCode());
		System.out.println(c4.hashCode());

	}

}
