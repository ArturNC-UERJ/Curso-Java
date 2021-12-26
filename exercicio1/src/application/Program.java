package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rec1.width = sc.nextDouble();
		rec1.height = sc.nextDouble();
		
		System.out.println("AREA = " + rec1.area());
		System.out.println("PERIMETER = " + rec1.perimeter());
		System.out.println("DIAGONAL = " + rec1.diagonal());
		
		
		sc.close();
	}

}
