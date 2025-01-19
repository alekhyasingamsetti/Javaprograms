package ex_TernaryOperator;

public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 30; int n2 = 24; int n3 =54;
        int Higher_number = n1>n2 ? (n1>n3 ? n1 : n3):(n2>n3 ? n2 : n3);
        System.out.printf("%d is the Highest Number\n",Higher_number);
    }
}
