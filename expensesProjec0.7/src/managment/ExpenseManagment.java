package managment;

import java.util.ArrayList;
import java.util.Date;
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
		System.out.println("\nList of expenses: ");
		int position = 1;
		for (Expense expense : user.getExpenses()) {
			System.out.println("№" + position + " " + expense);
			position++;
		}

	}

	public static ArrayList<Expense> update(Scanner reader, User user) {
		
		System.out.println("\nEnter expense name: ");
		String expenseName = reader.next();
		
		int count = 0;
		for (Expense expense : user.getExpenses()) {

			if (expenseName.equals(expense.getName())) {
				
				System.out.print("Expense value: " + expense.getValue());
				System.out.print(". Do you want to update expense value? (Y/N) ");
				String updateValueAnswer = reader.next();
				
				if (updateValueAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Enter expense value: ");
					double valueExpense = reader.nextDouble();
					expense.setValue(valueExpense);
				}
				
				System.out.print("Expense date: " + expense.getDate());
				System.out.print(". Do you want to update expense date? (Y/N) ");
				String updateDateAnswer = reader.next();
				
				if (updateDateAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Enter expense date (dd/MM/yyyy): ");
					String dateExpense = reader.next();
					
					Date dateToUpdate = expense.getDate();;
					try {
						dateToUpdate = new SimpleDateFormat("dd/MM/yyyy").parse(dateExpense);
					} catch (ParseException e) {
						System.out.print("Not updated! Invalid format!");
						e.printStackTrace();
					} 
					expense.setDate(dateToUpdate);
				}
					
				user.update(count , expense);
				
				break;
			}
			
			count++;
		}
		
		if (user.getExpenses().size() == count) 
			System.out.println(expenseName + " not found ....\n");
	}
		
	}

}
