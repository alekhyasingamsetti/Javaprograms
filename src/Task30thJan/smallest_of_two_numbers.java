package Task30thJan;

import java.util.Scanner;

public class smallest_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int a=sc.nextInt();
        System.out.println("Enter the number2:");
        int b=sc.nextInt();
        if(a<b){
            System.out.println(a+" is the smallest of two numbers");
        } else if (b<a) {
            System.out.println(b+" is the smallest of two numbers");
        }else{
            System.out.println("Both the numbers are equal");
        }
    }
}
