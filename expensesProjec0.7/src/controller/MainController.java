package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Language;
import model.User;

public class MainController {
	public static void AppStarting() {
		ArrayList<User> users = new ArrayList<User>();
		Scanner reader = new Scanner(System.in);
		HashMap<String, Language> languages = LanguagesController.initLanguages();
		Language language = languages.get("english");
		System.out.println(language);
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
				MenuController.mainMenu(language.getTag());
			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
			}

		}

		reader.close();
	}

}
