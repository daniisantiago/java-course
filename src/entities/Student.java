package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public double total() {
		return grade1 + grade2 + grade3;
	}
	
	public String situation() {
		if(total() >= 60 ) {
			return "PASS";
		}else {
			return "FAILED" + "\nMISSING " + String.format("%.2f", 60 - total()) + " POINTS";
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " +
				String.format("%.2f", total());
	}
}
