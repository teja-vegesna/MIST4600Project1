public class User {
	private String username;
	private String encPass;
	private String firstName;
	private String lastName;
	
	public User(String username, String rawPass, String firstName, String lastName) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		encPass = Hash.sha256(rawPass);
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getName() {
		return lastName + ", " + firstName;
	}
}
