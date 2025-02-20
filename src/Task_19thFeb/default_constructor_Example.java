package Task_19thFeb;


    class car {
        String brand;
        int speed;

        // Default Constructor (No parameters)
        car() {
            brand = "Unknown";
            speed = 0;
            System.out.println("Default Constructor Called");
        }

        void display() {
            System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
        }
    }

    public class default_constructor_Example {
        public static void main(String[] args) {
            car car1 = new car(); // Calls the default constructor
            car1.display();
        }
    }
