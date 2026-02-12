public class Abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
        h.eat();
        h.changeColor();
        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animal{
    void walk() {
        System.out.println("horse walk");
    }
    void changeColor() {
        color = "dark brown";
    }
}
class chicken extends Animal {
    void walk() {
        System.out.println("chicken walk");
    }
    void changeColor() {
        color = "white";
    }
}