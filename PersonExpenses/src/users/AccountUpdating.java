package users;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountUpdating {

	public static ArrayList<String> updateUser(Scanner reader, ArrayList<String> account) {

		System.out.println("\nEnter user name to update: ");
		System.out.println("Old name: " + account.get(1));
		System.out.print("New name: ");
		String userConsole = reader.next();
		
		account.set(1, userConsole);
		
		return account;
		
	}

	public static ArrayList<String> updateEmail(Scanner reader,  ArrayList<String> account) {
		
		System.out.println("\nEnter email  to update: ");
		System.out.println("Old email: " + account.get(2));
		System.out.print("New email: ");
		String emailConsole = reader.next();
		
		account.set(2, emailConsole);
		
		return account;
	}

	public static  ArrayList<String> updatePasswod(Scanner reader, ArrayList<String> account) {

		account.set(3,AccountCreation.createPasswod());
		
		return  account;
	}

}