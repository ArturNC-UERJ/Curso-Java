package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary *= ((percentage/100)+1);
	}
	
}
