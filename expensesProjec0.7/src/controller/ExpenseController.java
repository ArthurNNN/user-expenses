package controller;

import java.util.ArrayList;
import java.util.Scanner;

import managment.ExpenseManagment;
import model.Expense;
import model.Language;
import model.User;

public class ExpenseController {

	public static void start(Scanner reader, User user, Language language) {
		
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
			MenuController.expenseMenu(language.getTag());
			String command = reader.nextLine();

			if (command.equals("1")) {
				userExp = ExpenseManagment.add(reader, user);

			} else if (command.equals("4")) {
				userExp = ExpenseManagment.delete(reader, user);

			} else if (command.equals("5")) {
				ExpenseManagment.list(user);

			} else if (command.equals("0")) {
				break;
			}

		}

	}



}
