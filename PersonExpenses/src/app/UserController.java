package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class UserController {

	public static ArrayList<User> createUser(Scanner reader, ArrayList<User> users) {

		User newUser = new User();
		System.out.println("Tell me your name: ");
		String name = reader.nextLine();
		newUser.setName(name);

		System.out.println("Tell me your surname: ");
		String surname = reader.nextLine();
		newUser.setSurname(surname);

		String login = (name + surname).toLowerCase();
		newUser.setLogin(login);

		String password = createPassword();
		newUser.setPassword(password);

		users.add(newUser);
		printUserLoginAndPassword(newUser);

		return users;
	}

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

	public static ArrayList<User> updateUser(Scanner reader, ArrayList<User> users) {

		System.out.println("\nEnter user login to update: ");
//		System.out.println("Old name: " + user.getName());
//		System.out.print("New name: ");
		String loginConsole = reader.next();

		User user = Utils.findUserByLogin(loginConsole, users);

//		user.setName(nameConsole);

		return users;

	}

	public static User updatePassword(Scanner reader, User user) {

		user.setPassword(createPassword());

		return user;
	}

	public static String createPassword() {

		String password = "";

		password = password + Utils.createCharRandom() + Utils.createIntRandom(100) + Utils.createCharRandom()
				+ Utils.createIntRandom(100);

		return password;
	}

	public static void printUserLoginAndPassword(User user) {
		// scope #8
		System.out.println("\n------------------");
		System.out.println("User info: ");
		System.out.println("Login : " + user.getLogin());
		System.out.println("Password: " + user.getPassword());

	}

	public static void printAllUsers(ArrayList<User> users) {
		System.out.println("Users:");
		for (User UserToPrint : users) {
			System.out.println(UserToPrint);
		}
		System.out.println("\n");
	}

	public static String userToString(String user, String password) {

		String UserToString = user + "-" + password;

		return UserToString;

	}

}
