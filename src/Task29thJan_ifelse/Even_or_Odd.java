package Task29thJan_ifelse;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+",IS an even number");
        }
        else{
            System.out.println(num+",Is an odd number");
        }
    }
}
