package Task31stJan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is NOT a Palindrome Number.");
        }

        sc.close();  // Close the scanner
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;  // Store the original number
        int reversedNum = 0;

        while (num > 0) {  // Reverse the number
            int digit = num % 10;  // Get last digit
            reversedNum = reversedNum * 10 + digit;
            num /= 10;  // Remove last digit
        }

        return originalNum == reversedNum;
    }
}
