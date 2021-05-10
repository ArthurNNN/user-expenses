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

		Person max = new Person("Max", 30, 75, 170, 2500);
		Person lisa = new Person("Lisa", 18, 65, 165, 1200);
		Person jack = new Person("Jackson Pollock", 35, 80, 180, 8000);
//		
//
//		max.expenses.add(new Expense("Vodafone", 14.95, true));

		ArrayList<Expense> expensesMax = new ArrayList<>();

		expensesMax.add(new Expense("Vodafone", 14.95, true));
		expensesMax.add(new Expense("Ibedrola", 50.25, true));
		expensesMax.add(new Expense("iPhone X", 1200.00, false));
		expensesMax.add(new Expense("Room rent", 300.00, true));
		max.expenses = expensesMax;

		ArrayList<Expense> expensesLisa = new ArrayList<>();
		expensesLisa.add(new Expense("LlamaYa", 12.05, true));
		expensesLisa.add(new Expense("Endesa Gas", 70.50, true));
		expensesLisa.add(new Expense("Xiaomi", 125.50, true));
		expensesLisa.add(new Expense("Endesa Gas", 50.50 - 5, true));
		lisa.expenses = expensesLisa;

		ArrayList<Expense> expensesJack = new ArrayList<>();
		expensesJack.add(new Expense("Endesa Electricidad", 79.15, true));
		expensesJack.add(new Expense("Endesa Gas", 195.75, true));
		expensesJack.add(new Expense("Car maintenance", 1150.00, false));
		expensesJack.add(new Expense("Villa rent", 2500.00, true));
		expensesJack.add(new Expense("Aqua Barcelona", 113.25, true));
		jack.expenses = expensesJack;

		max.sportOffer(max.salaryAfterExpenses());
		lisa.sportOffer(lisa.salaryAfterExpenses());
		jack.sportOffer(jack.salaryAfterExpenses());

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

	public static void testExpensesPerson() {
		Person isa = new Person("Isabel", 18, 180, 60, 3000);
		System.out.println(isa);

		// option A
		MyDate mondayMorning = new MyDate(4, 5, 2021);
		Expense internetYoigoApril = new Expense("Internet 200MB Yoigo", 30, mondayMorning);
		isa.expenses.add(internetYoigoApril);

		MyDate lastSundayDate = new MyDate(14, 5, 2021);
		Expense lastSundayFun = new Expense("Bar and drinks and friends", 110, lastSundayDate);
		isa.expenses.add(lastSundayFun);

		MyDate lastSaturdayDate = new MyDate(14, 6, 2021);
		Expense lastSaturdayFun = new Expense("Bar and drinks and friends", 110, lastSaturdayDate);
		isa.expenses.add(lastSaturdayFun);

		// option B
		isa.expenses.add(new Expense("Internet 200MB Yoigo", 40, new MyDate(1, 5, 2021)));
		System.out.println("Expenses: " + isa.calculateExpenses(5));
	}

	private static void printPeople(ArrayList<Person> arrayToPrint) {
		System.out.println("People:");
		for (Person personToPrint : arrayToPrint) {
			System.out.println(personToPrint);
		}
		System.out.println("\n");
	}
}