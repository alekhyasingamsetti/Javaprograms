package Task_20thFeb;

// Parent Class (SuperClass)
class Vehicle {
    String brand = "Unknown";

    void honk() {
        System.out.println("Beep Beep!");
    }
}

// Child Class (SubClass) inheriting from Vehicle
class Car extends Vehicle {
    int speed = 120;

    void display() {
        System.out.println("Brand: " + brand); // Inherited property
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Inheritance_Example {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object of the subclass
        myCar.display(); // Accessing properties from both parent & child class
        myCar.honk();    // Inherited method
    }
}

