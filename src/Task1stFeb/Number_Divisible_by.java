package Task1stFeb;

import java.util.Scanner;

public class Number_Divisible_by {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num%5==0 &&num%11==0){
            System.out.println(num+" is divisible by both 5 and 11");
        }else {
            System.out.println(num+" is not divisible by both 5 and 11");
        }
    }
}
