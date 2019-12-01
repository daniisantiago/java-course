package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();

			List<String> dados = new ArrayList<>();
			while (line != null) {
				// System.out.println(line);
				String[] texto = line.split(",");
				double valor = Double.parseDouble(texto[1]) * Double.parseDouble(texto[2]);
				String dado = texto[0] + "," + String.format("%.2f", valor);
				dados.add(dado);
				line = br.readLine();

			}
			File path = new File(strPath);
			new File(path.getParent() + "\\out").mkdir();
			String newPath = path.getParent() + "\\out\\summary.csv";

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))) {
				for (String dado : dados) {
					bw.write(dado);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
