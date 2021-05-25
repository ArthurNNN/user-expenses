package model;

import java.util.Date;
import java.util.HashMap;

public class Student extends User {
	
	public  HashMap<String, Double> marks;
	public boolean active;
	public Date incriptionDate;
	
	public Student() {
		super();
	}

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

	public Date getIncriptionDate() {
		return incriptionDate;
	}

	public void setIncriptionDate(Date incriptionDate) {
		this.incriptionDate = incriptionDate;
	}

	
	
}
