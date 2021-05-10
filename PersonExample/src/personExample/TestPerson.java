package personExample;

public class TestPerson {
	public static void executePerson() {
		createAndTestObjectsPerson();
	}

	public static void createAndTestObjectsPerson() {

		Person sergi = new Person();

		Person isa = new Person("Isabel", 18);

		Person toni = new Person("Antonio", 30, 80, 180, 2000, 11250);

		System.out.println(sergi.toString());

		System.out.println(isa);

		System.out.println(toni);

		sergi.setName("Sergey");
		sergi.setAge(40);

		sergi.setWeigth(85);
		sergi.setHeigth(175);
		sergi.setBasicSalary(2500);

		System.out.println(sergi);

		System.out.println("Sergi's age: " + sergi.getAge());

		System.out.println("Isa's age: " + isa.getAge());

		System.out.println("Toni's age: " + toni.getAge());

	}

	public static void testMethodsObjectsPerson () {
		
		Person max = new Person("Max", 30, 75, 170, 2500, 8000);
		Person lisa = new Person("Lisa", 18);

		Person keti = max.haveChild("Keti", 5, lisa);

		System.out.println(keti);
	}
}