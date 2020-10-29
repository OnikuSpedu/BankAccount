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
        System.out.println("Attempt to move $"+amount+" from the " + getAccountID() + " to " + other.getAccountID());
        if (authenticate(password)) {
            System.out.println("Authentication Success");
            if(withdraw(amount)){
                if(other.deposit(amount)){
                    System.out.println(this);
                    System.out.println(other);
                    System.out.println();
                    return true;
                }else{
                    //This should never happen.
                    //Error message provided to make sure that is the case
                    System.out.println("CRITICAL ERROR! $"+amount + 
                                        " withdrawn from Account #" +  this.getAccountID() + 
                                        "Failed to add to Account #"+ other.getAccountID());
                }
            } 
            else{
            System.out.println("Transfer Failed");
            }
        } else {
            System.out.println("Authentication Failed");
        }
            
        return false;
    }

}