import java.util.*;

public class AccountManager {
	HashMap<String, User> users; //stores user 
	HashSet<String> usernames; //keep track of usernames, avoid duplicates
	
	public AccountManager() {
		this.users = new HashMap<>();
        this.usernames = new HashSet<>();
	}
	
	public boolean createAccount(String username, String rawPass, String fName, String lName) {
		if(usernames.contains(username)) {
			System.out.println("A user with the name: " + username + " already exists.");
			return false;
		} else {
			User newUser = new User(username, rawPass, fName, lName);
			users.put(username, newUser);
			usernames.add(username);
			return true;
		}
		
	}
	
	public User logIn(String username, String rawPass) {
		User user = users.get(username);
		String encPass = Hash.sha256(rawPass);
		
		if (user != null && user.getEncPass().equals(encPass)) {
		System.out.println("Login successful!");
		return user; //login worked
		
		}
		System.out.println("Login failed.");
		return null; //login failed
	}
	
}
