package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Product;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			double avg = list.stream().map(p -> p.getPrice()) // pegando so os preços dos produtos
					.reduce(0.0, (x, y) -> x + y) / list.size(); // tirando a media dos preços

			System.out.println("Average price: " + String.format("%.2f", avg));

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg) // filtrando os produtos que possuem o preço menor que a media
					.map(p -> p.getName()) // pegando somente os nomes desses produtos filtrados
					.sorted(comp.reversed()) // ordenando esses elementos por ordem decrescente alfabetica
					.collect(Collectors.toList()); // transformando a stream em lista

			names.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
