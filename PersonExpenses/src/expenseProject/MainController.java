package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

import view.*;

public class MainController {

	public static void AppStarting() {

		System.out.println("Welcome to Expenses Managment! ");
		System.out.println("------------------");

		ArrayList<User> users = new ArrayList<User>();

		Scanner reader = new Scanner(System.in);

		while (true) {
			Menu.mainMenu();
			String command = reader.nextLine();

			if (command.equals("1")) {
				users = UserCreation.createUser(reader, users);

			} else if (command.equals("2")) {
				LoginController.Login(reader, users);

			} else if (command.equals("3")) {
				users = UserUpdating.updateUser(reader, users);

			} else if (command.equals("4")) {
				users = UserDeleting.deleteUser(reader, users);

			} else if (command.equals("5")) {
				UserManagment.printAllUsers(users);
			} else {
				break;
			}
		}
	}
}
