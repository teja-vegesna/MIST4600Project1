import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private Date date;
    private User user;
    private User recipient;

    public Transaction(String type, double amount, User user) {
        this.type = type;
        this.amount = amount;
        this.date = new Date(); // Sets the current date and time
        this.user = user;
        this.recipient = recipient;
    }

    public String toString() {
        String pastTensed = switch (type) {
            case "deposit" -> "deposited";
            case "withdrawal" -> "withdrew";
            case "transfer" -> "transferred to " + (recipient != null ? recipient.getUsername() : "unknown");
            default -> "performed";
        };
        return user.getUsername() + " " + pastTensed + " " + amount + " on " + date;
    }
    
    public String getType() {
    	return type;
    }
    
    public double getAmount() {
    	return amount;
    }
    
    public Date getDate() {
    	return date;
    }
    
    public User getUser() {
    	return user;
    }
    
    public User getRecipient() {
    	return recipient;
    }
}
