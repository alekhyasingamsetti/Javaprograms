package Task_16thFeb;
//Book class which has an abstract method getDetails(),name, author, price.
//
//PrintMyBook class that inherits from the Book class. abstract
//
//Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
//
/// / Output
//
//"Harry Potter, J.k. Rowling, 120"
public class Abstraction {

    public static void main(String[] args) {
        MyBook PrintBook = new MyBook("hacker", "david", 50);
        PrintBook.getdetails();
    }
}

abstract class Book {
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getdetails();
}

class MyBook extends Book {
    public MyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getdetails() {
        System.out.println("Name:"+name+ ",Author :" +author+ ", price:" +price);
    }

}
