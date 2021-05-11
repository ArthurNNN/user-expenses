package expenses;

import java.util.ArrayList;
import java.util.Scanner;

import expenses.account.AccountDeleting;
import expenses.account.AccountManagment;
import expenses.account.AccountUpdating;
import expenses.user.UserCreation;

public class Controller {

	public static void AppStarting() {

		System.out.println("Enter you choice: ");
		Scanner reader = new Scanner(System.in);

		while (true) {
			String choice = reader.nextLine();

//			1
//			login
//			create

			UserCreation.createUser(null);

//			2
//			user
//			password
//			
//			3
//			expenses
//			---
//			---
//			
//			4
//			createUser
//			
//			
//			hasta 0

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

}
