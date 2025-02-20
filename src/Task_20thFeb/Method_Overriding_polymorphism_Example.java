package Task_20thFeb;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass - Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog Barks: Woof Woof!");
    }
}

// Subclass - Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat Meows: Meow Meow!");
    }
}

// Main class
public class Method_Overriding_polymorphism_Example {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound

        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Dog Barks: Woof Woof!

        Animal myCat = new Cat();
        myCat.makeSound(); // Output: Cat Meows: Meow Meow!
    }


}
