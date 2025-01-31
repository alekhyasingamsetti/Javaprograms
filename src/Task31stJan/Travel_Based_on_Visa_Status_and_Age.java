package Task31stJan;

import java.util.Scanner;

public class Travel_Based_on_Visa_Status_and_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your visa status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();
        if (isEligibleToTravel(age, visaStatus)) {
            System.out.println("You are eligible to travel.");
        } else {
            System.out.println("You are NOT eligible to travel.");
        }
    }

    public static boolean isEligibleToTravel(int age, String visaStatus) {
        // Age validation
        if (age < 0) {
            System.out.println("Error: Age cannot be negative.");
            return false;
        }
        if (age < 18) {
            System.out.println("Error: You must be at least 18 years old to travel.");
            return false;
        }
        if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Error: Visa status must be 'valid' or 'invalid'.");
            return false;
        }
        return visaStatus.equals("valid");
    }
}
