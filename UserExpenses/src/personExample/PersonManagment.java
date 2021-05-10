package personExample;

import java.util.ArrayList;

public class Persons {

	// Fields from Person Class

	public ArrayList<Persons> persons;

	// Constructor from Person Class
	

	public static void createPerson(Person person) {
		
	}
	
	public static void updatePerson(Person person) {
		
	}
	
	public static void deletePerson(Person person) {
		
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return "Person Data Fields:\n  name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth
				+ ", basicSalary=" + basicSalary + "\n";
	}

}