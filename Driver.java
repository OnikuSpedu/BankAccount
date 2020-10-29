public class Driver {
    public static void main(String[] args) {
        System.out.println("Initialize Account");
        BankAccount account = new BankAccount(0, "horrible password"); 
        System.out.println("getAccountID");
        System.out.println(account.getAccountID());
        System.out.println("getBalance");
        System.out.println(account.getBalance());
        System.out.println("toString - Account Info");
        System.out.println(account.toString());
        System.out.println("Password Changed");
        account.setPassword("still a bad password");
        System.out.println("Verify Password Changed");
        System.out.println(account.authenticate("still a bad password"));
        System.out.println("Attempt to withdraw 10 with a balance of 0");
        System.out.println(account.withdraw(10));
        System.out.println("toString - Account Info");
        System.out.println(account.toString());
        System.out.println("Attempt to deposit 10");
        System.out.println(account.deposit(10));
        System.out.println("toString - Account Info");
        System.out.println(account.toString());
        System.out.println("Attempt to withdraw 10 with a balance of 10");
        System.out.println(account.withdraw(10));
        System.out.println("toString - Account Info");
        System.out.println(account.toString());


        //Transfer Tests
        System.out.println("Transfer Tests");
        BankAccount b1 = new BankAccount(1000001, "abc123");
        BankAccount b2 = new BankAccount(1000231, "abcasdg23");
  
        System.out.println("Account b1:");
        b1.deposit(3000.0);
        b2.deposit(1234.0);
        System.out.println(b1);
        System.out.println("Account b2:");
        System.out.println(b2);
        System.out.println();
  
        
        double cashAmount = 300.0;

        while(cashAmount < 3000){
            //Incorrect password. Authentication should fail.
            b1.transferTo(b2, cashAmount, "wsjdjsfbjbD");
            //Correct Password. Authentication should a success.
            b1.transferTo(b2, cashAmount, "abc123");
            cashAmount *= 2;
        }
    }
}