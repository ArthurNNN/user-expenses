
package model;

public class Employee extends User implements SalariesCalculations, Holiday {

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

	@Override
	public void calculationSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculationTaxes() {
		// TODO Auto-generated method stub
		
	}

	public void calculationHoliday() {
		// TODO Auto-generated method stub
		
	}

	

}