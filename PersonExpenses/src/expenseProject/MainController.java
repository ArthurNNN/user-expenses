package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

import view.Menu;

public class MainController {

	public static void AppStarting() {
		
		System.out.println("Welcome to Expenses Managment! ");
		System.out.println("------------------");

		ArrayList<User> users = new ArrayList<User>();

		Scanner reader = new Scanner(System.in);

		while (true) {
			Menu.mainMenu();
			String command = reader.nextLine();
			if (command.equals("0")) {
				break;
			} else if (command.equals("1")) {
				// to-do login
				LoginController.Login(reader, users);
			}
			
			// Creation user;
			else if (command.equals("2")) {
				
				UserCreation.createUser(reader, users);
				
			} else if (command.equals("3")) {
				UserUpdating.updateUser(reader, users);
				break;
			}

			else {
				System.out.println("Please, put 1 to Login, 2 to Create, 3 to Update, 0 to Exit. Try another time...");
			}
			System.out.println("------------------");
		}
	}



}
