package Task5thFeb_For_while_loop;
//Print the multiplication table of 7
public class Whileloop_ex05 {
    public static void main(String[] args) {
        int num=7;
        int i=1;
        while(i<=20){
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
