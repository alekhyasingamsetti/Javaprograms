package Task31stJan;

import java.util.Scanner;

public class Eligible_for_a_Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        // Check loan eligibility
        if (isEligibleForLoan(age, salary, creditScore)) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are NOT eligible for a loan.");
        }

        scanner.close();
    }

    public static boolean isEligibleForLoan(int age, double salary, int creditScore) {
        // Age validation
        if (age < 18 || age > 80) {
            System.out.println("Error: Age must be between 18 and 80.");
            return false;
        }
        // Salary validation
        if (salary < 30000) {
            System.out.println("Error: Minimum salary requirement is ₹30,000.");
            return false;
        }
        // Credit score validation
        if (creditScore < 650 || creditScore > 1000) {
            System.out.println("Error: Credit score must be between 650 and 850.");
            return false;
        }
        return true;
    }
}
//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//
//    * Take the below User info and store it into the variables:
//
//              Age (integer)
//
//              Salary (double or float)
//
//              Credit Score (integer)
//
//
//
//    Age Validation:
//
//              :- Check if the age is a positive integer.
//
//              :- Ensure the age is at least 18 years old.
//
//              :- Max age can be 80.
//
//
//
//    Salary Validation:
//
//             :- Check if the salary is a positive number.
//
//             :- Define a minimum salary threshold (e.g., 30,000).
//
//    Credit Score Validation:
//
//             :- Check if the credit score is a positive integer.
//
//             :- Define a minimum credit score threshold (e.g., 650).
//
//             :- Max credit score threshold (e.g., 850).


