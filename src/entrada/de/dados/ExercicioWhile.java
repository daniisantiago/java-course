package entrada.de.dados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*EXERCICIO 1:
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida.
		 * Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser 
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
		 *  Considere que a senha correta � o valor 2002.
		 * */
		int senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
				
		/*EXERCICIO 2:
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
		 * o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo 
		 * menos uma de duas coordenadas for NULA (nesta situa��o sem escrever 
		 * mensagem alguma).
		 * */
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if( x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else {
				System.out.println("segundo");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		/*EXERCICIO 3:
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia
		 * de seus clientes. Escreva um algoritmo para ler o tipo de combust�vel abastecido
		 * (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio
		 * informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um 
		 * novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo
		 * informado for o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e
		 * a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme 
		 * exemplo.
		 */		
		int codigo, alcool = 0, gasolina = 0, diesel = 0;
		
		codigo = sc.nextInt();
		while(codigo != 4) {
			switch (codigo) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
			default:
				break;
			}
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
				
		sc.close();

	}

}
