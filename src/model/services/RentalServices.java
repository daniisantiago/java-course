package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		//pegando o valor em milisegundos da data
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		/*pegar a diferença dos dois tempos em horas: 
		 *divide o valor da diferença em milisegundos por 1000 para encontrar os segundos 
		 *depois divide esse valor de segundos por 60 para encontrar os minutos
		 *para finalizar divide o valor de minutos em 60 para encontrar as HORAS.
		 * */
		double hours = (double) (t2 - t1) /1000 /60 /60;
		
		double basicPayment;
		if(hours <= 12.0) {
			//usa-se o Math.ceil para arredondar para cima o valor... ex 4:10 vira 5:00 horas
			basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			//divide por 24 para encontrar o numero de dias
			basicPayment = Math.ceil(hours/24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
