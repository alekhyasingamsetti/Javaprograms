package Task29thJan_ifelse;

public class char_Vowles_consonents {
    public static void main(String[] args) {
        String a ="yuvaraj";
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
        System.out.println("Vowels: " + V);
        System.out.println("Consonants: " + C);
    }
}

