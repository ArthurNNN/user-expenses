package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Expense;
import model.User;

public class ExpenseController {

	public static void start(Scanner reader, User user) {
		


//		ArrayList<Expense> expenses = user.getExpenses();
		
		
//		user.expenses.add(new Expense("Endesa", 83.25, true));
//		user.expenses.add(new Expense("Orange", 13.75, true));
//		user.expenses.add(new Expense("Rent", 835.00, true));
//		user.expenses.add(new Expense("Xiaomi Note 9", 181.65, false));
		
		ArrayList<Expense> exp = new ArrayList<Expense>();
		
		exp.add(new Expense("Endesa", 83.25, true));
		exp.add(new Expense("Orange", 13.75, true));
		exp.add(new Expense("Rent", 835.00, true));
		exp.add(new Expense("Xiaomi Note 9", 181.65, false));
		
		user.setExpenses(exp);
		
		System.out.println(user);
		
//		Utils.printArray(expenses);

//		Menu.printExpenseMenu();

		ArrayList<Expense> userExp = user.getExpenses();

		while (true) {
			MenuController.expenseMenu();
			String command = reader.nextLine();

			if (command.equals("1")) {
				userExp = addExpense(reader, user);

			} else if (command.equals("4")) {
				userExp = deleteExpense(reader, user);

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
		
		System.out.println(user.expenses);

	}

}
