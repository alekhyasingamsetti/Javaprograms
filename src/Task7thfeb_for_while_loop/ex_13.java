package Task7thfeb_for_while_loop;

public class ex_13 {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {
            // Print stars for each row
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to next line
        }
    }
}
