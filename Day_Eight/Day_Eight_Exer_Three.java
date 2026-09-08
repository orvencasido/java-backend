public class Day_Eight_Exer_Three {
    public static void main (String [] args) {
        BankAccount acc1 = new BankAccount("Orven", 12345, 0);

        acc1.deposit(10000);
        acc1.withdraw(4000);
        acc1.displayBalance();
    } 
}

public class BankAccount {
    String accountName;
    int accountNumber;
    int balance;

    BankAccount(String accountName, int accountNumber, int balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public int deposit(int deposit) {
        balance += deposit;
        return balance;
    }

    public int withdraw(int withdraw) {
        balance -= withdraw;
        return balance;
    }
}