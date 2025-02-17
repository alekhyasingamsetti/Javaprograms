package Lab_OOPs_Abstraction;

    // Interface defining common behavior
    interface Device {
        void turnOn();
        void turnOff();
    }

    // Printer class implementing Device interface
    class Printer implements Device {
        @Override
        public void turnOn() {
            System.out.println("Printer is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Printer is OFF");
        }
    }

    // Scanner class implementing Device interface
    class Scanner implements Device {
        @Override
        public void turnOn() {
            System.out.println("Scanner is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Scanner is OFF");
        }
    }

    // Main class
    public class Interface {
        public static void main(String[] args) {
            Device myPrinter = new Printer();
            Device myScanner = new Scanner();

            myPrinter.turnOn();
            myScanner.turnOn();
        }
    }

