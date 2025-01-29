package Task29thJan_ifelse;

import java.util.Scanner;

public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println(num+" is a positive number");
        }else{
            System.out.println(num+" is a negative number");
        }
    }
}
