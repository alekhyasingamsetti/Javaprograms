package Task9thFeb_arrays;

import java.util.Scanner;
public class Pyramid_pattern {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            scanner.close();
        }
    }