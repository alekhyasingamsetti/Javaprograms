package Task7thfeb_for_while_loop;
import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        //mulitiplication table of a Given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();

        for (int i=0; i<=20; i++)
        {
            System.out.println(num + "x" + i + "=" +(num*i));
        }


    }
}
