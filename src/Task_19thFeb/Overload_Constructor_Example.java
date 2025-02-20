package Task_19thFeb;

class Cars {
    String brand;
    int speed;

    // 1️⃣ Default Constructor
    Cars() {
        this.brand = "Unknown";
        this.speed = 0;
        System.out.println("Default Constructor Called");
    }

    // 2️⃣ Constructor with One Parameter
    Cars(String brand) {
        this.brand = brand;
        this.speed = 100; // Default speed
        System.out.println("Constructor with One Parameter Called");
    }

    // 3️⃣ Constructor with Two Parameters
    Cars(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Constructor with Two Parameters Called");
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Overload_Constructor_Example {
    public static void main(String[] args) {
        Cars car1 = new Cars();               // Calls Default Constructor
        Cars car2 = new Cars("Toyota");       // Calls Constructor with One Parameter
        Cars car3 = new Cars("BMW", 220);     // Calls Constructor with Two Parameters

        car1.display();
        car2.display();
        car3.display();
    }
}

