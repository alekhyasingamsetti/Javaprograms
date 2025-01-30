package Task30thJan;

import java.util.Scanner;

public class Triangle_is_Valid_Based_on_Three_Sides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1: ");
        int a=sc.nextInt();
        System.out.println("Enter the side2: ");
        int b=sc.nextInt();
        System.out.println("Enter the side3: ");
        int c=sc.nextInt();
        if(a == b && b == c){
            System.out.println("It is a valid triangle");
        }else {
            System.out.println("It is not a valid triangle");
        }
    }
}
