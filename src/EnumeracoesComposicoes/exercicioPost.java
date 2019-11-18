package EnumeracoesComposicoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class exercicioPost {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//dados do post 1
		Date moment1 = sdf.parse("21/06/2018 13:05:44");
		String title1 = "Traveling to New Zelaland";
		String content1 = "I'm going to visit this wonderful country!";
		int likes1 = 12;
		
		Post post1 = new Post(moment1, title1, content1, likes1);
		post1.addComments(new Comment("Have a nice trip"));
		post1.addComments(new Comment("Wow that's awesome!"));
		
		//dados do post 2
		Date moment2 = sdf.parse("28/07/2018 23:14:19");
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		
		Post post2 = new Post(moment2, title2, content2, likes2);
		post2.addComments(new Comment("Good night"));
		post2.addComments(new Comment("May the Force be with you"));
		
		//criando uma lista com os posts
		List<Post> posts = new ArrayList<Post>();
		posts.add(post1);
		posts.add(post2);
		
		for(Post p : posts) {
			System.out.println(p);
		}
		
		sc.close();
	}
}
