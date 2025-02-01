package Task1stFeb;

import java.util.Scanner;

public class Conversion_into_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the days: ");
        int Days=sc.nextInt();
        int years = Days / 365;
        int remainingDays = Days % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.println(Days + " days = " + years + " years, " + months + " months, and " + days + " days.");
    }
}
