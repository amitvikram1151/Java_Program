public class SuperExample {
    public static void main(String[] args) {
        Dog g = new Dog();
        g.printColor();

    }
}   
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super();  // calls Animal constructor
        System.out.println("Dog constructor");
    }

    void printColor() {
        System.out.println(super.color);  // parent variable
        super.color = "black";
        System.out.println(super.color);
        System.out.println(this.color);   // child variable
        super.sound(); // parent method
    }
}