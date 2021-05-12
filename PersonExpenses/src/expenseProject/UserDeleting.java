package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDeleting {

	public static ArrayList<User> deleteUser(Scanner reader, ArrayList<User> users) {

		User user;
		String loginConsole;

		do {

			System.out.println("\nEnter user login to delete: ");
			loginConsole = reader.next();

			user = Utils.findUserByLogin(loginConsole, users);

			if (user != null) {
				break;
			}

			System.out.println("User not found, enter correct login please.");
		} while (user == null);

		users.remove(user);

		System.out.println("User with login " + loginConsole + " is deleted successfully!");

		return users;
	}

}
