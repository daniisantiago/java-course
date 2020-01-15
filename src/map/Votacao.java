package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Votacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> rating = new LinkedHashMap<>(); 
			
			String line = br.readLine();
			
			
			while(line != null) {
				
				String[] fields = line.split(",");
				String username = fields[0];
				int voto = Integer.parseInt(fields[1]);
				
				if(!rating.containsKey(username)) {
					rating.put(username, voto);
				}else {
					int aux = rating.get(username) + voto;
					rating.put(username, aux);
				}
				
				line = br.readLine();
			}
			
			for(String key : rating.keySet()) {
				System.out.println(key + ": " + rating.get(key));
			}
			
			sc.close();
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
}
