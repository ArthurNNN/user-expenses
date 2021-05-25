package model;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		User sergii = new Student("Sergii", "Voroskov", 40, "sergii@gmail.com", true);
		User isa = new Student("Isabel", "", 28, "isa@gmail.com", true);
		
		
		
		
		System.out.println(sergii);

		User borja = new Employee("", "", 25, 2500.0);
		
		List<User> users = new ArrayList<User>();
		
		users.add(sergii);
		users.add(borja);
		users.add(isa);
	}

}