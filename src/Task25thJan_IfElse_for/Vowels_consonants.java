package Task25thJan_IfElse_for;
//Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
public class Vowels_consonants {
    public static void main(String[] args) {
        String a ="yuvaraj_alekhya";
        int V=0,C=0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                V++;
            }
            // Check if it's a consonant
            else if (ch >= 'a' && ch <= 'z') {
                C++;
            }
        }

        // Print results
        System.out.println("Vowels: " + V);
        System.out.println("Consonants: " + C);
    }
}