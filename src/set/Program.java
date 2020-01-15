package set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				String [] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				//o set so add se os nomes forem diferentes
				set.add(new LogEntry(username, moment));
			
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
			
			sc.close();
			
		}catch(IOException e) {
			System.out.println("Erro: " +  e.getMessage());
		}

	}

}