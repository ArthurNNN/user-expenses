package expenses.user;

import java.util.ArrayList;

import expenses.Utils;

public class AccountManagment {
	// scope #3

	
	public static ArrayList<String> createAccount(ArrayList<String> account) {
		// scope #4

		String user = AccountCreation.createUser(account.get(0));
		account.add(user);
		
		
		String password = AccountCreation.createPassword();
		account.add(password);
		
		AccountCreation.printUserAccount(user, email, password);
		
		
		
		return account;
		
	}
	


}