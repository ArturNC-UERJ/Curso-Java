package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return this.grade1 + this.grade2 + this.grade3;
	}
	
	public void situacao() {
		if (finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("Missing " + (60 - finalGrade()) + " POINTS");
		}
	}	
}
