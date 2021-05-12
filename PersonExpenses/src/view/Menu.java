package view;

import java.util.Scanner;

import expenseProject.LoginController;
import expenseProject.User;
import expenseProject.UserCreation;
import expenseProject.UserDeleting;
import expenseProject.UserManagment;
import expenseProject.UserUpdating;

public class Menu {

	public static void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n --- Main menu ---");
		System.out.println("Enter your choice:");
		System.out.println("1 - To create a new user account / SingUp");
		System.out.println("2 - To logIn");
		System.out.println("3 - To edit/update an existing user account");
		System.out.println("4 - To delete an existing user account");
		System.out.println("5 - To print all existing user accounts");
		System.out.println("0 - To quit");

	}


	public static void expenseMenu() {
		System.out.println("\n --- Expense menu ---");
		System.out.println("Enter your choice:");
		System.out.println("1 - To add a new user expense");
		System.out.println("2 - To delete an expense");
		System.out.println("5 - To print all user expenses");
		System.out.println("0 - To quit to main menu");
	}

}
