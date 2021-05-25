package model;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		User sergii = new Student("Sergii", "Voroskov", 25, "sergii@gmail.com", true);
		System.out.println(sergii);

		User borja = new Employee("", "", 25, 2500.0);
		List<User> users = new ArrayList<User>();
		users.add(sergii);
		users.add(borja);
	}

}