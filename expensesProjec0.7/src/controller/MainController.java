package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Language;
import model.User;

public class MainController {
	public static void AppStarting() {

		// just to store some users we create along the program executes
		ArrayList<User> users = new ArrayList<User>();

		// fake user to test expenses
		users.add(new User("1", "1"));


		// declare languages object - type HashMap- and assign the result of
		// calling at method initLanguages of class LanguageController
		// initLanguages() is a method we use to initialize languages objects,
		// so, that is, we are going to create language objects like German, Spanish,
		// etc
		// and we will store in a hashMap
		HashMap<String, Language> languages = LanguagesController.initLanguages();

		// we could user ArrayList … so
		// ArrayList<Language> languages = LanguagesController. initLanguages();
		// we set english as default language of the app
		
		Language language = languages.get("russian");
		System.out.println(language);
		Scanner reader = new Scanner(System.in);


		while (true) {
			MenuController.mainMenu(language.getTag());
			String command = reader.nextLine();
			if (command.equals("0")) {
				break;
			} else if (command.equals("1")) {
				UserController.createUser(reader, users, language);
			} else if (command.equals("2")) {
				LoginController.validateUser(reader, users, language);
			} else if (command.equals("3")) {
				language = LanguagesController.languageSelection(reader, language, languages);
//				MenuController.mainMenu(language.getTag());
			} else if (command.equals("4")) {
				UserController.listUsers(users);
			} else {
				System.out.println(
						"\nPlease, you have to select 1-4 or 0. Try another time ...\n");
			}

		}
//		reader.close();

	}

}
