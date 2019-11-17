import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		//o resultado impresso vem com virgula por conta da configuração BR
		//duas casas decimais
		System.out.printf("%.2f%n", x);
		
		//definindo o idioma como dos EUA
		//Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		//concatenação com o printf, usar o % para definir a entrada de dados
		//%n é para a quebra linha
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
		
		//atividade
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println();
		System.out.println("Products:");
		System.out.printf("%s , which price is $ %.2f%n", product1, price1);
		System.out.printf("%s , which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
