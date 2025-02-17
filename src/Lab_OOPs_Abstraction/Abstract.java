package Lab_OOPs_Abstraction;

    // Abstract class defining common behavior
    abstract class BankAccount {
        double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        void deposit(double amount) {  // Concrete method
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }

        abstract void withdraw(double amount); // Abstract method

    }

    // Concrete class for Savings Account
    class SavingsAccount extends BankAccount {
        SavingsAccount(double balance) {
            super(balance);
        }

        @Override
        void withdraw(double amount) {
            if (balance - amount >= 500) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Minimum balance must be $500");
            }
        }
    }

    // Main class
    public class Abstract {
        public static void main(String[] args) {
            BankAccount acc = new SavingsAccount(1000);
            acc.deposit(500);
            acc.withdraw(900);
        }
    }
