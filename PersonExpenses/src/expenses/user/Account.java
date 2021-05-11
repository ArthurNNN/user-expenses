package expenses.user;

public class Account {
	String name;
	String surname;
	String login;
	String password;
	User user;
		
	public Account() {
		super();
	}

	public Account(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	

}
