package expenseProject;

import java.util.ArrayList;
import java.util.Scanner;

import view.Menu;

public class ExpenseController {

	public static void ExpenseProcessing(Scanner reader, User user) {

		ArrayList<Expense> expenses;

//		Menu.printExpenseMenu();

		expenses = new ArrayList<Expense>();

		while (true) {
			Menu.expenseMenu();
			String command = reader.nextLine();

			if (command.equals("1")) {
				expenses = addExpense(reader, user);

			} else if (command.equals("4")) {
				expenses = deleteExpense(reader, user);

			} else if (command.equals("5")) {
				printAllExpenses(user);

			} else if (command.equals("0")) {
				break;
			}

		}

	}

	public static ArrayList<Expense> addExpense(Scanner reader, User user) {
		
		ArrayList<Expense> expenses = user.getExpenses();
		
		return expenses;

	}

	public static ArrayList<Expense> deleteExpense(Scanner reader, User user) {
		
		ArrayList<Expense> expenses = user.getExpenses();
		
		return expenses;

	}

	public static void printAllExpenses(User user) {

	}

}
