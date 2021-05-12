package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {

	public static boolean Login(Scanner reader, ArrayList<User> users) {

		String login;
		String password;

		int count = 1;
		String loginConsole;
		String passwordConsole;

		do {
//			boolean err = false;
//			do {

			System.out.println("\nEnter Login : ");
			loginConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();

			User user = Utils.findUserByLogin(loginConsole, users);
//
//				if (user == null) {
//					err = true;
//					System.out.println("User not found, enter correct login please.");
//				}

			login = user.getLogin();
			password = user.getPassword();

//			} while (err = true);

			System.out.println("\n------------------");

			if (loginConsole.equals(login) && passwordConsole.equals(password)) {
				System.out.println("Access Granted! Welcome!");
				return true;

			} else if (loginConsole.equals(login)) {
				System.out.println("Invalid Password!");
			} else if (passwordConsole.equals(password)) {
				System.out.println("Invalid Login!");
			} else {
				System.out.println("Invalid Login & Password!");
			}

			System.out.println("Total attempts: " + count + "/3");
			count++;

			if (count == 4)
				System.out.println("User blocked!");

		} while (count < 4);

		return false;
	}

}
