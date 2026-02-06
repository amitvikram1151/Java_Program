public class Inheritance {
    public static void main(String[] args) {
      Fish shark = new Fish();
      shark.fins = 2;
      shark.name = "shark";  
      shark.display();
      shark.eats();
      shark.swim();
    }
}
//base class
class Animal {
    String name;

    void eats() {
        System.out.println("eats");
    }

    void Breaths() {
        System.out.println("Breaths");
    }
}
//derived class / subclass
class Fish extends Animal{
    int fins;

    void display() {
        System.out.println("fins : " + fins);
        System.out.println("name : " + name);
    }
    void swim() {
        System.out.println("swims in water");
    }
}
//dance of bansti
