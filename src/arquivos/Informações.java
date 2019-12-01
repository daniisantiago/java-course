package arquivos;

import java.io.File;
import java.util.Scanner;

public class Informações {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//pegando so o nome do arquivo
		System.out.println("getName: " + path.getName());
		
		//pegando so caminho do arquivo sem o nome
		System.out.println("getParent: " + path.getParent());
		
		//pegando todo o caminho
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
