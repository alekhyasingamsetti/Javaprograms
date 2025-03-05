package Task_5thMarch;
// Parent Class representing a Bank Account
class BankAccount {
    private double balance = 10000.50; // Private: Accessible only within this class

    String accountType = "Savings"; // Default: Accessible within the same package

    protected String branchName = "Downtown Branch"; // Protected: Accessible in subclasses

    public String bankName = "National Bank"; // Public: Accessible everywhere

    // Private method - Only accessible within this class
    private void showBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    // Default method - Accessible within the same package
    void showAccountType() {
        System.out.println("Account Type: " + accountType);
    }

    // Protected method - Accessible within the package and by subclasses
    protected void showBranch() {
        System.out.println("Branch: " + branchName);
    }

    // Public method - Accessible from anywhere
    public void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    // Public method to access the private method inside the class
    public void displayBalance() {
        showBalance(); // This allows controlled access to private data
    }
}

// Subclass extending BankAccount
class PremiumAccount extends BankAccount {
    public void showPremiumDetails() {
        // System.out.println(balance); //  Cannot access private variable
        // showBalance(); //  Cannot access private method

        System.out.println("Account Type: " + accountType); //  Default - Same package access
        System.out.println("Branch Name: " + branchName); // Protected - Accessible in subclass
        System.out.println("Bank Name: " + bankName); // Public - Accessible everywhere

        showAccountType(); // Default method accessible in same package
        showBranch(); //  Protected method accessible in subclass
        showBankName(); //  Public method accessible everywhere
    }
}

// Another class in the same package
public class Bank_system {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Private variable & method - Not accessible
        // System.out.println(account.balance); //  Not allowed
        // account.showBalance(); //  Not allowed

        // Default access - Allowed since we are in the same package
        System.out.println(account.accountType); // Allowed
        account.showAccountType(); //  Allowed

        // Protected access - Allowed within the same package
        System.out.println(account.branchName); //  Allowed
        account.showBranch(); //  Allowed

        // Public access - Always allowed
        System.out.println(account.bankName); //  Allowed
        account.showBankName(); //  Allowed

        // Accessing private data via a public method
        account.displayBalance(); //  This allows controlled access to private data

        // Creating an object of subclass
        PremiumAccount premiumAcc = new PremiumAccount();
        premiumAcc.showPremiumDetails(); // Demonstrating access in subclass
    }
}

