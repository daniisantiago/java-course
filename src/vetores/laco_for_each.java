package vetores;

public class laco_for_each {

	public static void main(String[] args) {
		
		//instanciando o vetor
		String vet[] = new String[] {"Maria", "Bob", "Alex"};

		//imprimindo os elementos com o for normal
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println("---------------------");
		//imprimindo os elementos pelo for each
		//primeiro coloca o tipo dos elementos do vetor
		for(String elemento : vet) {
			System.out.println(elemento);
		}
	}

}
