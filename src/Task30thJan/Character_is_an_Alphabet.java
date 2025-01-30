package Task30thJan;

import java.util.Scanner;

public class Character_is_an_Alphabet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is NOT an Alphabet.");
        }
    }
}
