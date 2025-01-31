package Task31stJan;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }

        sc.close();  // Close the scanner
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();  // Get number of digits

        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            sum += Math.pow(digit, numDigits);  // Add digit^numDigits to sum
            num /= 10;  // Remove last digit
        }

        return originalNum == sum;  // Compare original number with sum
    }
}
