package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public int id;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double grossSalary) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double aux = grossSalary * (percentage / 100);
		grossSalary += aux;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", netSalary());
	}
}
