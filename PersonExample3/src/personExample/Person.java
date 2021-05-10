package personExample;

import java.util.ArrayList;

public class Person {
//fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;
	public double money;
	public ArrayList<String> likes;
	public Person child;
	public Person parent1;
	public Person parent2;

//Constructor from Person Class

	public Person() {
		super();
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary, double money,
			ArrayList<String> likes, Person child, Person parent1, Person parent2) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		this.money = money;
		this.likes = likes;
		this.child = child;
		this.parent1 = parent1;
		this.parent2 = parent2;
	}

	public Person(String name, int age, Person parent1, Person parent2) {
		super();
		this.name = name;
		this.age = age;
		this.parent1 = parent1;
		this.parent2 = parent2;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary, double money) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		this.money = money;
	}

	public Person(String name, int age, int weigth, int heigth) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
	}

	// Methods from Person Class
	public Person haveChild(String childName, int childAge, Person parent2) {

		Person child = new Person(childName, childAge, this, parent2);
		return child;
	}

	public void becomeOlder() {
		this.age = age + 1;
	}

	public double yearNetSalary() {

		// first i must check weather THIS object|
		if (true) {
		} else {
		}
		return 0.0;
	}

//Getters and Setters and toString
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary="
				+ basicSalary + ", money=" + money + ", likes=" + likes + ", child=" + child + ", parent1=" + parent1
				+ ", parent2=" + parent2 + "]";
	}

	// toString

}