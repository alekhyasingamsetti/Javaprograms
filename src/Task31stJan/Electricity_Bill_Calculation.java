package Task31stJan;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double units;
        double Bill;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units");
        units=sc.nextDouble();
        if (units >= 0 && units <= 100) {
            Bill = units * 0.50;
            System.out.println("your electricity bill is " + Bill + "Rs");
        } else if (units >= 101 && units <= 200) {
            Bill = units * 0.75;
            System.out.println("your electricity bill is " + Bill + "Rs");

        } else if (units >= 201 && units <= 300) {
            Bill = units * 1.20;
            System.out.println("your electricity bill is " + Bill + "Rs");
        } else if (units > 300) {
            Bill = units * 1.50;
            System.out.println("your electricity bill is " + Bill + "Rs");
        }
    }
}