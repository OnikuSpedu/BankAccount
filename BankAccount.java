public class BankAccount {

    private double balance;
    private int accountID;
    private String password;

    public BankAccount( int accountID, String password) {
        balance = 0;
        this.accountID = accountID;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public String toString() {
        String str = "";
        str += "#" + accountID + "\t" + "#" + balance;
        return str;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean deposit(double amount) {
        boolean deposited = false;
        if (amount > 0) {
            balance += amount;
            deposited = true;
        }
        return deposited;
    }

    public boolean withdraw(double amount) {
        boolean withdrew = false;
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            withdrew = true;
        }
        return withdrew;
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        if (authenticate(password)) {
            if(withdraw(amount)){
                if(other.deposit(amount)){
                    return true;
                }
            } 
        } 
            
        return false;
    }

}