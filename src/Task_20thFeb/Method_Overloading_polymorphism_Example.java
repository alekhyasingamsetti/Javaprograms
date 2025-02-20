package Task_20thFeb;

class MathOperations {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different data types
    double add(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading_polymorphism_Example {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Addition of 2 numbers: " + math.add(5, 10));
        System.out.println("Addition of 3 numbers: " + math.add(5, 10, 15));
        System.out.println("Addition of double numbers: " + math.add(5.5, 2.3));
    }


}
