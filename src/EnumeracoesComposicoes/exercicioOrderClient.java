package EnumeracoesComposicoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class exercicioOrderClient {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Ler os dados de um pedido com N itens (N fornecido pelo usuario). Depois, mostrar um sumario do pedido conforme exemplo.
		//Nota: o instate do pedido deve ser o instante do siste: new Date()
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		//inicializando o cliente
		Client client = new entities.Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		//inicializando o pedido
		Order order = new Order(new Date(), status, client);
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			//inicializando o item
			OrderItem item = new OrderItem(quantity, price, new Product(nameProduct, price));
			order.addItem(item);
		}
		
		System.out.println("\nORDER SUMMARY:");
		System.out.println("Order moment: " + sdf1.format(order.getMoment()));
		System.out.println("Order statud: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() 
						   + " (" + sdf.format(order.getClient().getBirthDate()) + ") - " 
						   + order.getClient().getEmail());
		
		System.out.println("Order items:");
		for(OrderItem i : order.getItens()) {
			System.out.println(i.getProduct().getName() 
							   + ", $" + String.format("%.2f", i.getPrice()) 
							   + ", Quantity: " + i.getQuantity() 
							   + ", Subtotal: $" + String.format("%.2f", i.subTotal()));
		}
		
		System.out.println("Total Price: $" + String.format("%.2f", order.total()));
		sc.close();

	}

}
