package CLI_19thJan;

public class CLI_02 {
    public static void main(String[] args){
        String num1 = args[0];
        int a = Integer.parseInt(num1);
        String num2 = args[1];
        int b = Integer.parseInt(num2);
        int c = (a>b? a : b);
        System.out.printf("Highest Number is " + c);
    }
}
