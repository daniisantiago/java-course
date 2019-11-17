package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criando um program p ler um numero inteiro N e uma matriz de ordem N contendo numeros inteiros.
		//e mostrando a diagonal principal e a quantidade de valores negativos da matriz
		
		int n = sc.nextInt();
		//definindo uma matriz bidimencional
		int[][] mat  = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		//contando os numeros negativos
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0)
					count ++;
			}
		}
		
		System.out.println("\nNegative numbers = " + count);
		
		//mat.length diz a quantidade de linhas
		//mat[i].length diz a quantidade de colunas 
		
		sc.close();
	}
}
