package Task30thJan;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2=sc.nextInt();
        System.out.println("Enter the num3: ");
        int num3=sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+" is the largest of three numbers");
        } else if (num2>=num1 && num2>=num3) {
            System.out.println(num2+" is the largest of three numbers");
        }else{
            System.out.println(num3+" is the largest of three numbers");
        }
    }
}
