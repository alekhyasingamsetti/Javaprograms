package Task_20thFeb;

// Encapsulated Class
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Setter method to update balance (with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Main Class
public class Encapsulation_Example {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount("John Doe", 5000);

        // Accessing data using methods (Encapsulation in action)
        account.displayAccountInfo();
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(6000); // Invalid withdrawal
        account.displayAccountInfo();
    }
}
