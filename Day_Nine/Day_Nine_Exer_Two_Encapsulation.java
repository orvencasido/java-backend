public class Day_Nine_Exer_Two_Encapsulation {
    public static void main (String [] args) {
        BankAccount acc1 = new BankAccount(
            "Orven Casido",
            12345,
            0
        );

        acc1.displayInfo();

        acc1.deposit(500);
        acc1.withdraw(1000);

        acc1.displayInfo();
    }
}

public class BankAccount {
    private String accountName;
    private int accountNumber;
    private int balance;

    BankAccount (String accountName, int accountNumber, int balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public String getAccounName() {
        return accountName;
    }

    public int getAccontNumer() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int depositMoney) {
        if (depositMoney <= 0) {
            System.out.println("Cannot Input Negative Money!");
        } else {
            balance += depositMoney;
        }
        return balance;
    }

    public int withdraw(int withdrawMoney) {
        if (withdrawMoney > balance) {
            System.out.println("Cannot withdraw more than balance!");
        } else {
            balance -= withdrawMoney; 
        }
        return balance;
    }
}