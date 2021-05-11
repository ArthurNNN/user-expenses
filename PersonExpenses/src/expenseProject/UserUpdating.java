package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserUpdating {

	public static ArrayList<String> updateUser(Scanner reader, ArrayList<String> User) {

		System.out.println("\nEnter user name to update: ");
		System.out.println("Old name: " + User.get(1));
		System.out.print("New name: ");
		String userConsole = reader.next();
		
		User.set(1, userConsole);
		
		return User;
		
	}



	public static  ArrayList<String> updatePassword(Scanner reader, ArrayList<String> User) {

		User.set(3,UserCreation.createPassword());
		
		return  User;
	}

}