package Task30thJan;

import java.util.Scanner;

public class smallest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int a=sc.nextInt();
        System.out.println("Enter the number2: ");
        int b=sc.nextInt();
        System.out.println("Enter the number3: ");
        int c=sc.nextInt();
        if (a <= b && a <= c) {
            System.out.println(a+" is the smallest of three numbers");
        } else if (b <= a && b <= c) {
            System.out.println(b+" is the smallest of three numbers");
        }else{
            System.out.println(c+" is the smallest of three numbers");
        }
    }
}
