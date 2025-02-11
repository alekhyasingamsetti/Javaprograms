package Task9thFeb_arrays;

import java.util.Arrays;

public class Second_Smallestin_Array {
    public static void main(String[] args) {
        int[] array = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(array);
        System.out.println("Second smallest number in array = " + array[1]);
    }
}
