package model;

import java.util.ArrayList;

public class User {

	// Fields from User Class
	public String login;
	public String name;
	public String password;
	public String surname;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;

	public ArrayList<Expense> expenses;

	// Constructor from User Class
	public User() {
	}

	public User(String name, String surname, String login, String password) {
		super();
		this.login = login;
		this.name = name;
		this.password = password;
		this.surname = surname;
	}

	public User(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public User(String name, int age, int weigth, int heigth, double basicSalary) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		this.expenses = new ArrayList<Expense>();
	}

	
	
	
	// Methods from User Class
	public double salaryAfterExpenses() {

		double salaryMensual = this.basicSalary;
		double sumExpenses = 0;
		System.out.println("\n-----------------------------------");
		System.out.println("Client name is " + this.name + ".");
		System.out.println("Client salary is " + this.basicSalary + ".");
		System.out.println("\nClient expenses are: " + expenses + ".");
		for (Expense expense : this.expenses) {
			if (expense.getIsMensual()) {
				sumExpenses = sumExpenses + expense.getValue();
			}

		}
		if (sumExpenses > salaryMensual) {
			System.out.println("Salary is less than expenses!");
		}
		System.out.println("\nTotal client expenses: " + sumExpenses);
		System.out.println(this.name + "'s amount after payment of expenses: " + (salaryMensual - sumExpenses));
		return salaryMensual - sumExpenses;
	}

	public boolean isAdult() {
		System.out.println(this.name + " is " + this.age + " years old.");
		return this.age >= 18 && this.age < 80;
	}

	public void sportOffer(double clientMoney) {
		if (this.isAdult()) {
			if (clientMoney <= 1000) {
				System.out.println("We offer you: running sport!");
			} else if (clientMoney > 1000 && clientMoney <= 5000) {
				System.out.println("We offer you: bicycle sport");
			} else if (clientMoney > 5000) {
				System.out.println("We offer you: golf!");
			}
		} else {
			System.out.println("Sorry. We haven't offert for you anything.");
		}
	}

	public void becomeOlder() {
		this.age = age + 1;
	}

	public double yearNetSalary() {

		double yearNetSalary = 0.0;

		// first i must check weather THIS object have got money
		// this.basicSalary > 1
		if (this.basicSalary > 1) {

			yearNetSalary = this.basicSalary * 14;

			if (this.age > 30) {
				yearNetSalary = yearNetSalary * 0.88;
			} else {
				yearNetSalary = yearNetSalary * 0.94;
			}

		} else {
			System.out.println(name + " has not got any salary, so YearNetSalary not available!");
		}

		return yearNetSalary;
	}

	public double calculateExpenses(int month) {
		double expensesMonth = 0.0;
		for (Expense expense : this.expenses) {
			if (expense.getDate().getMonth() == month)
				expensesMonth = expensesMonth + expense.getValue();
		}
		return expensesMonth;
	}

	// Getters and Setters and toString
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", name=" + name + ", password=" + password + ", surname=" + surname + ", age="
				+ age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary=" + basicSalary + ", \nexpenses="
				+ expenses + "]";
	}

}