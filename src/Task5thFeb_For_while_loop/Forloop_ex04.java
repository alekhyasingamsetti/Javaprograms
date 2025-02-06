package Task5thFeb_For_while_loop;
// Print the sum of first 10 natural numbers
public class Forloop_ex04 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("Sum of first 10 natural numbers: "+sum);
    }
}
