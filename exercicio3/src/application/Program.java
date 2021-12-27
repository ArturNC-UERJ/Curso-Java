package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student est1 = new Student();
		
		est1.name = sc.nextLine();
		est1.grade1 = sc.nextDouble();
		est1.grade2 = sc.nextDouble();
		est1.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + est1.finalGrade());
		est1.situacao();
		
		sc.close();
	}

}
