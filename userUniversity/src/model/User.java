
package model;

import java.util.ArrayList;

public class User {

	public String name;
	public String surname;
	public int age;
	public String email;
	public String userName;
	public String password;
	public boolean isValidated = false;
	public boolean isBlocked = false;
	public ArrayList<Expense> expenses;

	public User(String name, String surname, int age, String email, String userName, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.expenses = new ArrayList<Expense>();
	}

	public User(String name, String surname, int age, String userName, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.expenses = new ArrayList<Expense>();
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.isValidated = true;
		this.expenses = new ArrayList<Expense>();
	}

	public User() {
		this.expenses = new ArrayList<Expense>();
	}

	public User(String name, String surname, int age, String email) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
	}

	public User(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;

	}

	public void add(Expense expense) {

		this.expenses.add(expense);

	}

	public void delete(Expense expense) {

		this.expenses.remove(expense);
	}

	public void update(int index, Expense expense) {

		this.expenses.set(index, expense);

	}

	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email + ", userName="
				+ userName + ", password=" + password + "]";
	}

}