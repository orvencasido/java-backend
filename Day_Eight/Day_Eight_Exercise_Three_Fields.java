public class Day_Eight_Exercise_Three_Fields {
    public static void main (String [] args) {
        BankAccount acc1 = new BankAccount();

        acc1.accountNumber = 123;
        acc1.ownerName = "Orven Casido";
        acc1.balance = 9999999;

        System.out.println("Account Number: " + acc1.accountNumber);
        System.out.println("Owner Name: " + acc1.ownerName);
        System.out.println("Balance: " + acc1.balance); 
    }
}

public class BankAccount {
    int accountNumber = 0;
    String ownerName = "";
    int balance = 0;
}