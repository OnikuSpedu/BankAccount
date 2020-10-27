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
        System.out.println("Reset Password");
        account.setPassword("still a bad password");
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
    }
}