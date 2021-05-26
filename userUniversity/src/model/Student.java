package model;

import java.util.Date;
import java.util.HashMap;

public class Student extends User {

	public HashMap<String, Double> marks;
	public boolean active;
	public Date inscriptionDate;

	public Student(String name, String surname, int age, String email, boolean active) {

		super(name, surname, age, email);

		this.marks = new HashMap<String, Double>();
		this.active = active;

	}

	public HashMap<String, Double> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, Double> marks) {
		this.marks = marks;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

	@Override
	public String toString() {

		return "Student [marks=" + marks + ", active=" + active + ", inscriptionDate=" + inscriptionDate + ", name="
				+ name + ", surname=" + surname + ", age=" + age + "]";
	}

}