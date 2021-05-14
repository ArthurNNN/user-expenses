package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Language;
import model.User;
import view.*;

public class MainController {

	public static void AppStarting() {

		System.out.println("Welcome to Expenses Managment! ");
		System.out.println("------------------");

		ArrayList<User> users = new ArrayList<User>();

		Scanner reader = new Scanner(System.in);

		// HashMap<String,Language> lenguages = new HashMap<String, Language>();
		Language english = new Language("English", "eng", "create", "login", "language", "quit");
		Language catalan = new Language("Catalan", "cat", "crear", "logejar-se", "llengua", "sortir");
		Language spanish = new Language("Spanish", "spa", "crear", "loguearse", "lengua", "salir");
//		Language russian = new Language("Russian", "rus");
		Language language = english;
		while (true) {
			MenuController.mainMenu(language.getTag());
			String command = reader.nextLine();
			if (command.equals(language.getQuit())) {
				break;
			} else if (command.equals(language.getCreate())) {
				UserController.createUser(reader, users);
			} else if (command.equals(language.getLogin())) {

				LoginController.validateUser(reader, users);

			} else if (command.equals(language.getLanguage()))

			{
			}

			String langaugeToSelect = LanguagesController.LanguggeSelection(reader, language);

			if (langaugeToSelect.equals(language == english)) {
			}
		}

		users.add(new User("Max", "Pain", "maxpain", "123qwe"));
		users.add(new User("Uma", "Thurman", "umathurman", "123qwe"));

//		while (true) {
//			MenuController.mainMenu();
//			String command = reader.nextLine();
//
//			if (command.equals("1")) {
//				users = UserController.createUser(reader, users);
//
//			} else if (command.equals("2")) {
//				LoginController.validateUser(reader, users);
//
//			} else if (command.equals("3")) {
//				users = UserController.updateUser(reader, users);
//
//			} else if (command.equals("4")) {
//				users = UserController.deleteUser(reader, users);
//
//			} else if (command.equals("5")) {
//				UserController.printAllUsers(users);
//
//			} else if (command.equals("0")) {
//				break;
//			}
//		}
	}
}
