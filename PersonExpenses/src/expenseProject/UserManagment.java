package expenseProject;

import java.util.ArrayList;

public class UserManagment {

	public static void printAllUsers(ArrayList<User> users) {
		System.out.println("Users:");
		for (User UserToPrint : users) {
			System.out.println(UserToPrint);
		}
		System.out.println("\n");
	}

}