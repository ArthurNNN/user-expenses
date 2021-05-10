package personExample;

import java.util.ArrayList;

public class TestPerson {
	public static void executePerson() {
		createAndTestObjectsPerson();
	}

	public static void createAndTestObjectsPerson() {

		Person sergi = new Person();

		Person isa = new Person("Isabel", 18);

		Person toni = new Person("Antonio", 30, 80, 180, 2000);

//		System.out.println(sergi.toString());
//
//		System.out.println(isa);
//
//		System.out.println(toni);

		sergi.setName("Sergey");
		sergi.setAge(40);

		sergi.setWeigth(85);
		sergi.setHeigth(175);
		sergi.setBasicSalary(2500);

//		System.out.println(sergi);
//
//		System.out.println("Sergi's age: " + sergi.getAge());
//
//		System.out.println("Isa's age: " + isa.getAge());
//
//		System.out.println("Toni's age: " + toni.getAge());

	}

	public static void testMethodsObjectsPerson() {

		Person max = new Person("Max", 30, 75, 170, 2500.0);
		Person lisa = new Person("Lisa", 18, 65, 165, 1200);
		Person jack = new Person("Jackson Pollock", 35, 80, 180, 8000);

		ArrayList<Double> expensesMax = new ArrayList<>();
		expensesMax.add(12.43);
		expensesMax.add(60.25);
		expensesMax.add(300.00);

		ArrayList<Double> expensesLisa = new ArrayList<>();
		expensesLisa.add(5.00);
		expensesLisa.add(62.00);
		expensesLisa.add(200.00);

		ArrayList<Double> expensesJack = new ArrayList<>();
		expensesJack.add(120.00);
		expensesJack.add(90.25);
		expensesJack.add(1500.00);

		max.sportOffer(max.salaryAfterExpenses(expensesMax));

		lisa.sportOffer(lisa.salaryAfterExpenses(expensesLisa));

		jack.sportOffer(jack.salaryAfterExpenses(expensesJack));

	}

	public static void testListObjectsPerson() {

		ArrayList<Person> people = new ArrayList<>();

		Person alexa = new Person("Alexa", 25, 60, 170);
		Person jack = new Person("Jackson Pollock", 35);
		Person marc = new Person();

		people.add(alexa);
		people.add(marc);
		people.add(jack);

		printPeople(people);
	}

	private static void printPeople(ArrayList<Person> arrayToPrint) {
		System.out.println("People:");
		for (Person personToPrint : arrayToPrint) {
			System.out.println(personToPrint);
		}
		System.out.println("\n");
	}
}