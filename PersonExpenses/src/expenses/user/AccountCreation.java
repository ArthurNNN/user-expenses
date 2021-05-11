package expenses.user;

import expenses.Utils;

public class AccountCreation {

	public static String createUser(String createUser) {

		int blank = createUser.indexOf(" ");
		String user = createUser.substring(0, blank);

		return user;
	}

	public static String createPassword() {

		String password = "";

		password = password + Utils.createCharRandom() + Utils.createIntRandom(10000) + Utils.createCharRandom()
				+ Utils.createCharRandom() + Utils.createIntRandom(596);

		return password;
	}

	public static void printUserAccount(String user, String password) {

		System.out.println("User Account: ");
		System.out.println("User : " + user);

		System.out.println("Password: " + password);

	}

	public static String accountToString(String user, String password) {

		String accountToString = user + "-" + password;

		return accountToString;

	}
}
