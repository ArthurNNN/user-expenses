package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {
	
	
	public static User findUserByLogin(String login, ArrayList<User> users) {
		for (User user : users) {
			if (user.getLogin().equals(login)) {
				return user;
			}
		}
		System.out.println("User with login "+login+"no exists!");
		return null;
	}
	
	public static boolean Login (Scanner reader, ArrayList<User> users) {

		//System.out.println(user);
		//System.out.println(password);

		String login;
		String password;
		
		
		int count = 1;
		String loginConsole;
		String passwordConsole;
		System.out.println("\nLogin:");

		do {

			System.out.println("\nEnter Login : ");
			loginConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();
			
			User user = findUserByLogin(loginConsole, users);
			
			login = user.getLogin();
			password = user.getPassword();

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
