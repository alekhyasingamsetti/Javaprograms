package Task31stJan;
import java.util.Scanner;

public class Bonus_Based_on_Salary_and_Years_of_Experience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your monthly salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your years of experience: ");
        int experience = scanner.nextInt();
        // Calculate and display bonus
    //public static double calculateBonus(double salary, int experience) {
        double bonusPercentage = 0;
        if(experience<1) {
            System.out.println("Not eligible for bonus");
        } else if (experience <= 3) {
            bonusPercentage = salary * 0.05; // 5%
            System.out.println("Your bonus amount: ₹" + bonusPercentage);
        } else if (experience <= 6) {
            bonusPercentage = salary * 0.10;// 10%
            System.out.println("Your bonus amount: ₹" + bonusPercentage);
        } else {
            bonusPercentage = salary * 0.15;// 15%
            System.out.println("Your bonus amount: ₹" + bonusPercentage);
        }
    }
}