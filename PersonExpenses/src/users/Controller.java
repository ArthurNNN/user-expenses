package users;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void AppStarting() {

		// scope #2
		System.out.println("Enter Name and Surname: ");
		Scanner reader = new Scanner(System.in);

		String userToCreateAccount = reader.nextLine();

		ArrayList<String> account = new ArrayList<String>();

		account.add(userToCreateAccount);

		account = AccountManagment.createAccount(account);

		boolean isValidated = Login.validateAccount(reader, account);

		if (isValidated) {

			Utils.printArray(account);

			account = AccountUpdating.updateUser(reader, account);
			account = AccountUpdating.updateEmail(reader, account);
			account = AccountUpdating.updatePasswod(reader, account);

			Utils.printArray(account);

			// fake deleting ...
			account = AccountDeleting.deleteAccount(account);

			Utils.printArray(account);
			isValidated = false;
		}

		reader.close();
	}

}
