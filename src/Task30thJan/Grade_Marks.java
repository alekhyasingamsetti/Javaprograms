package Task30thJan;

import java.util.Scanner;

public class Grade_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of student(0-100): ");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            if (score >= 90 && score <= 100) {
                System.out.println("student got A+");
            } else if (score >= 80 && score <= 89) {
                System.out.println("student got A");
            } else if (score >= 70 && score <= 79) {
                System.out.println("student got B");
            } else if (score >= 60 && score <= 69) {
                System.out.println("student got C");
            } else if (score >= 50 && score <= 59) {
                System.out.println("student got D");
            } else if (score >= 40 && score <= 49) {
                System.out.println("student got E");
            } else {
                System.out.println("student got F(failed)");
            }
        }
    }
}
