import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private Date date;
    private User user;

    public Transaction(String type, double amount, User user) {
        this.type = type;
        this.amount = amount;
        this.date = new Date(); // Sets the current date and time
        this.user = user;
    }

    public String toString() {
        String pastTensed;
        if ("deposit".equals(type)) {
            pastTensed = "deposited";
        } else if ("withdrawal".equals(type)) {
            pastTensed = "withdrew";
        } else {
            pastTensed = "performed";
        }
        return user.getUsername() + " " + pastTensed + " " + amount + " on " + date;
    }
    
    public getType() {
    	
    }
}
