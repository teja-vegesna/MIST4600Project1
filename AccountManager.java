import java.util.*;

public class AccountManager {
	HashMap<String, User> users; //stores user 
	HashSet<String> usernames; //keep track of usernames, avoid duplicates
	
	public AccountManager() {
		this.users = new HashMap<>();
        this.usernames = new HashSet<>();
	}
	
	public void createAccount(String username, String password, String fName, String lName) {
		if(usernames.contains(username)) {
			System.out.println("A user with the name: " + username + " already exists.");
		} else {
			User newUser = new User(username, password, fName, lName);
		}
	}
	
	public User logIn(String username, String rawPass) {
		User user = users.get(username);
		String encPass = Hash.sha256(rawPass);
		
		if (user != null && user.getEncPass().equals(encPass)) {
		encPass = null;
		return user; //login worked
		}
		encPass = null;
		return null; //login failed
	}
	
}
