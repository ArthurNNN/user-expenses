package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserUpdating {

	public static ArrayList<User> updateUser(Scanner reader, ArrayList<User> users) {

		System.out.println("\nEnter user login to update: ");
//		System.out.println("Old name: " + user.getName());
//		System.out.print("New name: ");
		String loginConsole = reader.next();
		
		User user = Utils.findUserByLogin( loginConsole, users);

//		user.setName(nameConsole);

		return users;

	}



	public static User updatePassword(Scanner reader, User user) {

		user.setPassword(UserCreation.createPassword());

		return user;
	}

}