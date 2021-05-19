package controller;

import menu.*;

public class MenuController {

	public static void mainMenu(String tag) {

		switch (tag) {
		case "eng":
			englishMenu.mainMenu();
			break;
		case "esp":
			spanishMenu.mainMenu();
			break;
		case "cat":
			catalanMenu.mainMenu();
			break;
		case "rus":
			russianMenu.mainMenu();
			break;
		default:
			russianMenu.mainMenu();
		}

//		System.out.println("\n --- Main menu ---");
//		System.out.println("Enter your choice:");
//		System.out.println("1 - To create a new user account / SingUp");
//		System.out.println("2 - To logIn");
//		System.out.println("3 - To edit/update an existing user account");
//		System.out.println("4 - To delete an existing user account");
//		System.out.println("5 - To print all existing user accounts");
//		System.out.println("0 - To quit");

	}

	public static void expenseMenu() {

		System.out.println("\n --- Expense menu ---");
		System.out.println("Enter your choice:");
		System.out.println("1 - To add a new user expense");
		System.out.println("2 - To delete an expense");
		System.out.println("5 - To print all user expenses");
		System.out.println("0 - To quit to main menu");
	}

	public static void LanguagesMenu(String tag) {
		// TODO Auto-generated method stub

	}

}
