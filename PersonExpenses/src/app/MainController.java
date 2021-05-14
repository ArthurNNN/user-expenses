package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.User;
import view.*;

public class MainController {

	public static void AppStarting() {

		System.out.println("Welcome to Expenses Managment! ");
		System.out.println("------------------");

		ArrayList<User> users = new ArrayList<User>();

		Scanner reader = new Scanner(System.in);

		users.add(new User("Max", "Pain", "maxpain", "123qwe"));
		users.add(new User("Uma", "Thurman", "umathurman", "123qwe"));

		while (true) {
			MenuController.mainMenu();
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

			} else if (command.equals("0")) {
				break;
			}
		}
	}
}