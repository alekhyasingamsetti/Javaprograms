package Task30thJan;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();  // Close the scanner
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // Numbers <= 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {  // Check divisibility from 2 to √n
            if (n % i == 0) {
                return false;  // If divisible, it's not a prime number
            }
        }
        return true;
    }
}
