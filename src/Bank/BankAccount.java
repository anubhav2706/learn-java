package Bank;

public class BankAccount {
    private double balance;  // account balance

    // Constructor
    public BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void display() {
        System.out.println("Balance = " + balance);
    }
}