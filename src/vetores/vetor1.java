package vetores;

import java.util.Locale;
import java.util.Scanner;
public class vetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double media = 0.0;
		for(int i = 0; i < n; i++) {
			media += vet[i];
		}
		System.out.printf("Média das alturas: %.2f", media/n);
				
		sc.close();

	}

}
