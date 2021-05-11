package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCreation {

	public static void createUser(Scanner reader, ArrayList<User> users)

	{

		User newUser = new User();
		System.out.println("Tell me your name: ");
		newUser.setName(reader.nextLine());

		System.out.println("Tell me your surname: ");
		newUser.setSurname(reader.nextLine());
		System.out.println("Tell me your age: ");
		newUser.setAge(reader.nextInt());

		// to-do methods create user and password
		users.add(newUser);
	}
	
	
	public static ArrayList<String> createUser(ArrayList<String> User) {
		// scope #4

		String user = UserCreation.createUser(User.get(0));
		User.add(user);
		
		
		String password = UserCreation.createPassword();
		User.add(password);
		
		UserCreation.printUser(user, password);
		
		
		
		return User;
		
	}

	public static String createUser(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String createPassword() {
		// scope #7

		String password = "";

		password = password + Utils.createCharRandom() + Utils.createIntRandom(10000)
		+ Utils.createCharRandom() + Utils.createCharRandom()
				+ Utils.createIntRandom(596);

		return password;
	}
	
	public static void printUser(String user, String password) {
		// scope #8

		System.out.println("User User: ");
		System.out.println("User : " + user);
		System.out.println("Password: " + password);

	}

	public static String userToString (String user, String email, String password) {
		
		String UserToString = user + "-" + email + "-" + password;
		
		return UserToString;
		
		
	}

}
