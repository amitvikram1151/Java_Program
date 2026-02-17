public class Overriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        Dog d = (Dog)a;
        d.sound();
    }
}
class Animal {
    void eat() {
        System.out.println("animal eats");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("dog eats");
    }
    void sound() {
        System.out.println("dog barks");
    }
}

