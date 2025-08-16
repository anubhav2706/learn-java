package Bank;
import java.util.*;

public class BankApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Create an account with opening balance
        System.out.print("Enter opening balance: ");
        double amount = sc.nextDouble();
        BankAccount bal = new BankAccount(amount);  // create account object

        System.out.println("\n--- Initial Account Status ---");
        bal.display();  // show initial balance

        // Step 2: Deposit money into account
        System.out.print("\nEnter deposit amount: ");
        double depAmount = sc.nextDouble();
        bal.deposit(depAmount);  // deposit money
        System.out.println("You deposited: " + depAmount);

        // Show balance after deposit
        System.out.println("--- After Deposit ---");
        bal.display();

        // Step 3: Withdraw money from account
        System.out.print("\nEnter withdrawal amount: ");
        double wAmount = sc.nextDouble();
        bal.withdraw(wAmount);  // withdraw money
        System.out.println("You withdrew: " + wAmount);

        // Step 4: Show final balance after all transactions
        System.out.println("\n--- Final Account Status ---");
        bal.display();

        sc.close(); // close scanner
    }
}