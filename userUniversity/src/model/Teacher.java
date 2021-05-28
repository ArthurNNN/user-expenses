package model;

public class Teacher extends Employee implements Holiday{

	public double extraSalaryPerCourse;

	public Teacher(String name, String surname, int age, double salary, double extraSalaryPerCourse) {

		super(name, surname, age, salary);

		this.extraSalaryPerCourse = extraSalaryPerCourse;

	}

	public double getExtraSalaryPerCourse() {
		return extraSalaryPerCourse;
	}

	public void setExtraSalaryPerCourse(double extraSalaryPerCourse) {
		this.extraSalaryPerCourse = extraSalaryPerCourse;
	}

	@Override
	public String toString() {

		return "Teacher [extraSalaryPerCourse=" + extraSalaryPerCourse + ", salary=" + salary + ", name=" + name
				+ ", surname=" + surname + ", age=" + age + "]";
	}

}