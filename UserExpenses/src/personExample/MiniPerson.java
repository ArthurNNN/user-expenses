package personExample;

public class MiniPerson {
//fields from Person Class
	public String name;


//Constructor from Person Class
	public MiniPerson() {
		super();
	}

	public MiniPerson(String name) {
		super();
		this.name = name;
	}

//Methods from Person Class

//Getters and Setters and toString
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// toString

	@Override
	public String toString() {
		return "Person fieldes: ( name=" + name + " )";
	}

}
