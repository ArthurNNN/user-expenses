package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCreation {

	public static void createUser(Scanner reader, ArrayList<User> users)

	{

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

//		System.out.println("Your login is: ");

//		System.out.println("Tell me your age: ");
//		newUser.setAge(reader.nextInt());

		// to-do methods create user and password
		users.add(newUser);
		printUserLoginAndPassword(newUser);
	}

//	public static ArrayList<String> createUser(ArrayList<String> User) {
//		// scope #4
//
//		String user = UserCreation.createUser(User.get(0));
//		User.add(user);
//		
//		
//		String password = UserCreation.createPassword();
//		User.add(password);
//		
//		UserCreation.printUser(user, password);
//		
//		
//		
//		return User;
//		
//	}
//
//	public static String createUser(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static String createPassword() {
		// scope #7

		String password = "";

		password = password + Utils.createCharRandom() + Utils.createIntRandom(100) + Utils.createCharRandom()
				+ Utils.createIntRandom(100);

		return password;
	}

	public static void printUserLoginAndPassword(User user) {
		// scope #8

		System.out.println("User info: ");
		System.out.println("Login : " + user.getLogin());
		System.out.println("Password: " + user.getPassword());

	}

	public static String userToString(String user, String password) {

		String UserToString = user + "-" + password;

		return UserToString;

	}

}
