package entities;

public class Conta {
	private String number;
	private String name;
	private double saldo;
	private final double tax = 5.00;
	
	public Conta() {
	
	}
	
	public Conta(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public Conta(String number, String name, double value) {
		this.number = number;
		this.name = name;
		deposito(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double value) {
		saldo -= value + tax;
	}
	
	public void deposito(double value) {
		saldo += value;
	}
	
	public String toString() {
		return "Account "
			 + getNumber()
			 + ", Holder: "
			 + getName()
			 +", Balance: $ "
			 +String.format("%.2f", getSaldo());
	}
}
