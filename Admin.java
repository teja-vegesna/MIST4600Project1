import java.util.*;

public class Admin extends User {
	private AccountManager accountManager;
	
	public Admin(String username, String rawPass, String firstName, String lastName) {
		super(username, rawPass, firstName, lastName);
	}
	
	public ArrayList<User> getUsers() {
		return new ArrayList<>(accountManager.users.values());
    }
	
}
