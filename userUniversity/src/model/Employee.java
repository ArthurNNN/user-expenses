
package model;

public class Employee extends User {

	public double salary;

	public Employee(String name, String surname, int age, double salary) {
		super(name, surname, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

}