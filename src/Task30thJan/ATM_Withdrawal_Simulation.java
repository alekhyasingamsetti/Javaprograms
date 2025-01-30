package Task30thJan;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        int balance = 10000;

        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Display current balance
        System.out.println("Welcome to the ATM!");
        System.out.println("Your current balance: ₹" + balance);

        // Take user input for withdrawal amount
        System.out.print("Enter the amount to withdraw: ₹");
        int withdrawAmount = scanner.nextInt();

        // Check withdrawal conditions
        if (withdrawAmount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of ₹100.");
        } else if (withdrawAmount > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            // Deduct the amount from balance
            balance =balance-withdrawAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);
        }

        scanner.close();  // Close the scanner
    }
    }
