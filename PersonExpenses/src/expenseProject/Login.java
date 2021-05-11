package expenseProject;

import java.util.Scanner;

public class Login {

	public static boolean validateUser (Scanner reader, User user) {

		//System.out.println(user);
		//System.out.println(password);

		String login = user.getLogin();
		String password = user.getPassword();
		
		
		int count = 1;
		String loginConsole;
		String passwordConsole;
		System.out.println("\nLogin:");

		do {

			System.out.println("\nEnter Login : ");
			loginConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();

			if (loginConsole.equals(user) && passwordConsole.equals(password)) {
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

			if (count == 4) System.out.println("User blocked!");
			
		} while (count < 4);
		
		

		return false;
	}

}
