package managment;

import java.util.ArrayList;
import java.util.Scanner;

import controller.MenuController;
import model.Expense;
import model.User;

public class ExpenseManagment {

	public static ArrayList<Expense> add(Scanner reader, User user) {

		ArrayList<Expense> expenses = user.getExpenses();

		return expenses;

	}

	public static ArrayList<Expense> delete(Scanner reader, User user) {

		ArrayList<Expense> expenses = user.getExpenses();

		return expenses;

	}

	public static void list(User user) {

		System.out.println(user.expenses);

	}

}
