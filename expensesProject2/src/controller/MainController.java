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
		Language language = languages.get("rus");
		while (true) {
			MenuController.mainMenu(language.getTag());
			String command = reader.nextLine();
			if (command.equals(language.getQuit())) {
				break;
			} else if (command.equals(language.getCreate())) {
				UserController.createUser(reader, users, language);
			} else if (command.equals(language.getLogin())) {
				LoginController.validateUser(reader, users, language);
			} else if (command.equals(language.getLanguage())) {
				language = LanguagesController.languageSelection(reader, language, languages);
			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
			}
			reader.close();
		}
	}

}
