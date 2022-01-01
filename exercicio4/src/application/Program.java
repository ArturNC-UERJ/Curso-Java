package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String number, name;
		char op;
		double value;
		Account account;
		
		System.out.print("Enter account number: ");
		number = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		op = sc.next().charAt(0);
		
		if (op == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account = new Account(number,name,value);
		} else {
			account = new Account(number,name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(account);	
		
		sc.close();
	}

}
