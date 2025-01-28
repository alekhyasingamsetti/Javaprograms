package Task25thJan_IfElse_for;
//Palindrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
public class Palindrome {
    public static void main(String[] args) {
        String a="madam";
        String reversed = ""; // To store the reversed string

        // Reverse the string using charAt()
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed += a.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (a.equals(reversed)) {
            System.out.println("The string \"" + a + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + a + "\" is not a palindrome.");
        }
    }
}
