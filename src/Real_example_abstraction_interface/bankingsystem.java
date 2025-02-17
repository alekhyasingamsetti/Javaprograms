package Real_example_abstraction_interface;


// Interface for Loan Services
interface LoanService {
    void applyForLoan(double amount);
}

// Abstract Class for Bank Account
abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) { // Common behavior
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    abstract void withdraw(double amount); // Different for each account type

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Savings Account (Extends BankAccount but does NOT implement LoanService)
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 500) { // Minimum balance condition
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Minimum balance of $500 required!");
        }
    }
}

// Current Account (Extends BankAccount AND Implements LoanService)
class CurrentAccount extends BankAccount implements LoanService {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of $" + amount + " has been approved!");
    }
}

// Main Class to Test the Banking System
public class bankingsystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(900);
        savings.checkBalance();

        System.out.println("----------------------");

        CurrentAccount current = new CurrentAccount(2000);
        current.deposit(1000);
        current.withdraw(500);
        current.applyForLoan(5000); // Loan feature available
        current.checkBalance();
    }
}

