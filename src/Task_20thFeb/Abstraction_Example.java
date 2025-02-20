package Task_20thFeb;

// Abstract class - Defines common structure but hides implementation details
abstract class Vehicles {
    abstract void startEngine(); // Abstract method (must be implemented by subclasses)

    // Concrete method (same for all vehicles)
    void stopEngine() {
        System.out.println("Engine Stopped.");
    }
}

// Subclass - Car
class Cars extends Vehicles {
    @Override
    void startEngine() {
        System.out.println("Car Engine Started with Key Ignition.");
    }
}

// Subclass - Bike
class Bike extends Vehicles {
    @Override
    void startEngine() {
        System.out.println("Bike Engine Started with Kick Start.");
    }
}

// Main class
public class Abstraction_Example {
    public static void main(String[] args) {
        Vehicles myCar = new Cars();
        myCar.startEngine(); // Output: Car Engine Started with Key Ignition.
        myCar.stopEngine();  // Output: Engine Stopped.

        System.out.println("\n----------------\n");

        Vehicles myBike = new Bike();
        myBike.startEngine(); // Output: Bike Engine Started with Kick Start.
        myBike.stopEngine();  // Output: Engine Stopped.
    }
}

