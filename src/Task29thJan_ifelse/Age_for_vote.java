package Task29thJan_ifelse;
import java.util.Scanner;
public class Age_for_vote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not Eligible for vote");
        }
    }
}
