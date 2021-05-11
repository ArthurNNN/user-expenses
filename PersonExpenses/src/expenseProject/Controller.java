package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void AppStarting() {

		ArrayList<User> users = new ArrayList<User>();
		
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			menu();
			String command = reader.nextLine();
			if (command.equals("quit")) {
				break;
			} else if (command.equals("create")) {
				UserCreation.createUser(reader, users);
			}
			// UserCreation.createuser(reader);
			else if (command.equals("login")) {
			}
			// to-do login
			else {
				System.out.println("Please, you have to write \"create\", \"login\" or \"quit\". Try another time...");
			}
		}
	}

	public static void menu() {

		System.out.println("Welcome to Expenses Managment! ");
		System.out.println("------------------");
		System.out.println("Enter 999 to exit. ");

	}

}
