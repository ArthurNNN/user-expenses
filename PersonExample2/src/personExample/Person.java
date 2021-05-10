package personExample;

import java.util.ArrayList;

public class Person {

	// Fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;

	// Constructor from Person Class
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, int weigth, int heigth) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
	}

	// Methods from Person Class
	public double salaryAfterExpenses(ArrayList<Expense> expenses) {

		double salaryMensual = this.basicSalary;
		double sumExpenses = 0;
		System.out.println("\n" + "Client name is " + this.name + ".");
		System.out.println("Client's salary is " + this.basicSalary + ".");
		System.out.println("Client's expenses are " + expenses + ".");
		for (double expense : expenses) {
			sumExpenses = sumExpenses + expense;
		}
		if (sumExpenses > salaryMensual) {
			System.out.println("Salary is less than expenses!");
		}
		System.out.println("Total client's expenses: " + sumExpenses);
		System.out.println("Salary of " + this.name + "  after pay expenses: " + (salaryMensual - sumExpenses));
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

	// Getters and Setters and toString
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	// toString
	@Override
	public String toString() {
		return "Person Data Fields:\n  name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth
				+ ", basicSalary=" + basicSalary + "\n";
	}

}