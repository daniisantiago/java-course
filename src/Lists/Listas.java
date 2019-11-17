package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		//instanciando a lista... obs List é uma interface e ArrayList uma classe
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Carla");
		list.add("Bianca");
		list.add("Ingrid");
		list.add("Bia");
		
		//adicionando depois uma pessoa na posicao 2
		list.add(2, "Marco");
		
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		//remover alguem da lista pelo valor
		list.remove("Anna");
				
		//remover alguem da lista pela posicao
		list.remove(1);
		
		//remover por predicado pessoas que comecem com a letra M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//buscando elementos na lista (retorna o index do elemento se achou, -1 se nao encontrou)
		System.out.println("-----------------");
		System.out.println("Index of Bob: " +list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		//filtrando e deixando na lista somente quem começa com a letra B
		System.out.println("-----------------");
		//usa o stream para transformar para String para aplicar o lambda e depois usa o collect para transformar de volta p list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		for(String x : result){
			System.out.println(x);
		}
		
		//encontrando o primeiro elemento que atenda ao predicado dado
		//nesse caso o primeiro elemento que tenha o i como segunda letra
		System.out.println("-----------------");
		//caso n encontre o elemento vai retornar null
		String name = list.stream().filter(x->x.charAt(1) == 'i').findFirst().orElse(null);
		System.out.println(name);
	}

}
