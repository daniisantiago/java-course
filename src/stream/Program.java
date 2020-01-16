package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		//multiplicar cada elemento da lista por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//criando uma lista com stream
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//interando elementos em uma lista
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		//limitando o numero de elementos para 10 e transformando em array
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		//sequencia de fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		//soma de todos os elementos da list
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma: " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) //filtrando os elementos pares da list
				.map(x -> x * 10) //multiplicando os elementos pares por 10
				.collect(Collectors.toList()); //transformando a stream em list
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
