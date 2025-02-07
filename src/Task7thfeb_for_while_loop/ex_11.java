package Task7thfeb_for_while_loop;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
//factorial of number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        // Check for negative numbers
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
