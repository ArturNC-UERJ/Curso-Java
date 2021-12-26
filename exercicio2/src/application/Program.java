package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double percentage;
		
		Employee emp1 = new Employee();

		System.out.print("Name: ");
		emp1.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp1.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp1.tax = sc.nextDouble();
		
		System.out.printf("\nEmployee: " + emp1.name + ", $ %.2f%n", emp1.netSalary());
		
		System.out.print("\nWich percentage to increase salary? ");
		percentage = sc.nextDouble();
		emp1.increaseSalary(percentage);
		
		System.out.printf("\nUpdated data: " + emp1.name + ", $ %.2f\n", emp1.netSalary());
		
		sc.close();
	}

}
