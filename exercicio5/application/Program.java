package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] rooms = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int numStudents = sc.nextInt();
		
		for (int i = 1; i <= numStudents; i++) {
			System.out.println();
			System.out.println("Rent #" + i);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int chosenRoom = sc.nextInt();
			
			rooms[chosenRoom] = new Room(name, email);
			
		}
		
		System.out.println("\nBusy rooms: ");
		
		for (int i = 0; i < 10; i++) {
			
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
						
		}
		
		sc.close();
	}

}
