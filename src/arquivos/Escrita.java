package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //parametro true para n recriar o arquivo
			for(String line : lines) {
				bw.write(line); //escrevendo no arquivo
				bw.newLine(); //pulando linha
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
