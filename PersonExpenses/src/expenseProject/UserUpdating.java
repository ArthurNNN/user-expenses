package expenseProject;

import java.util.Scanner;

public class UserUpdating {

	public static User updateUser(Scanner reader, User user) {

		System.out.println("\nEnter user login to update: ");
		System.out.println("Old name: " + user.getName());
		System.out.print("New name: ");
		String nameConsole = reader.next();
		
		user.setName(nameConsole);
		
		return user;
		
	}



	public static  User updatePassword(Scanner reader, User user) {

		user.setPassword(UserCreation.createPassword());
		
		return  user;
	}

}