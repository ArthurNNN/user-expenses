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
			} else if (command.equals("1")) {
				UserCreation.createUser(reader, users);
			}
			// UserCreation.createuser(reader);
			else if (command.equals("2")) {
			} else if (command.equals("3")) {
				break;
			}
			// to-do login
			else {
				System.out.println("Please, put 1 to Create, 2 to Login or 3 to quit. Try another time...");
			}
		}
	}

	public static void menu() {

		System.out.println("Welcome to Expenses Managment! ");
		System.out.println("------------------");
		System.out.println("Put 1 to Create, 2 to Login or 3 to quit");

	}

}
