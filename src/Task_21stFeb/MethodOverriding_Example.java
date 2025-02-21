package Task_21stFeb;

//A vehicle rental system has different pricing for different vehicle types.
//1️⃣ Car Rental → Charges ₹1000 per day.
//2️⃣ Bike Rental → Charges ₹500 per day.
// 3️⃣ Truck Rental → Charges ₹2000 per day.
//Each vehicle calculates its rental price differently,
// but the method name remains the same (calculateRental).
// Parent class
class Vehicle {
    void calculateRental(int days) {
        System.out.println("Calculating rental for " + days + " days.");
    }
}
class Car extends Vehicle {
    @Override
    void calculateRental(int days) {
        System.out.println("Car rental for " + days + " days: ₹" + (days * 1000));
    }
}
class Bike extends Vehicle {
    @Override
    void calculateRental(int days) {
        System.out.println("Bike rental for " + days + " days: ₹" + (days * 500));
    }
}
class Truck extends Vehicle {
    @Override
    void calculateRental(int days) {
        System.out.println("Truck rental for " + days + " days: ₹" + (days * 2000));
    }
}
public class MethodOverriding_Example {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.calculateRental(3);
        Vehicle bike = new Bike();
        bike.calculateRental(5);
        Vehicle truck = new Truck();
        truck.calculateRental(2);
    }
}