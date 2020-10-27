public class BankAccount {

    private double balance;
    private int accountID;
    private String password;

    public BankAccount( int id, String pw) {
        balance = 0;
        accountID = id;
        password = pw;
    }

    public double getBalance() {
        return balance;
    }

    
    
}