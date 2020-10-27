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

    public int getAccountID() {
        return accountID;
    }

    public String toString() {
        String str = "";
        str += accountID + "\t" + balance;
        return str;
    }

    public void setPassword(String newPass) {
        password = newPass;
    }

    public boolean deposit(double amount) {
        boolean deposited = false;
        if (amount > 0) {
            balance += amount;
            deposited = true;
        }
        return deposited;
    }

    
}