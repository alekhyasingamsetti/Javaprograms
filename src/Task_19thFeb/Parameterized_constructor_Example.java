package Task_19thFeb;

class bike {
    String brand;
    int speed;

    // Parameterized Constructor
    bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Parameterized_constructor_Example {
    public static void main(String[] args) {
        bike car1 = new bike("Toyota", 180);  // Passing values to the constructor
        bike car2 = new bike("BMW", 220);

        car1.display();
        car2.display();
    }
}

