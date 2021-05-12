package expenseProject;

import java.util.ArrayList;
import java.util.Random;

public class Utils {

	public static int createIntRandom(int top) {
		// scope #9
		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		// scope #9
		// Random rand = new Random();
		// String alphabetChars =
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";
		String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/" ;

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

		return charRandom;

	}
	
	public static User findUserByLogin(String login, ArrayList<User> users) {
		for (User user : users) {
			if (user.getLogin().equals(login)) {
				return user;
			}
		}
		System.out.println("User with login "+ login +" no exists!");
		return null;
	}

	public static String fromStringToUser(String account) {

		int dash = account.indexOf("-");
		String user = account.substring(0, dash);

		return user;
	}

	public static void printArray(ArrayList<String> arrayToPrint) {

		System.out.println("\nAccount:");

		for (String elementToPrint : arrayToPrint) {
			System.out.println(elementToPrint);
		}
		System.out.println("\n");

	}

}
