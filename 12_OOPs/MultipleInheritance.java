public class MultipleInheritance {
    public static void main(String[] args) {
        bear b = new bear();
        b.eat();
        b.run();
    }
}
interface Heribiours {
    void run();
}
interface Carniours {
    void eat();
}

class bear implements Heribiours, Carniours {
    public void run() {
        System.out.println("run fast");
    }
    public void eat() {
        System.out.println("eats faster");
    }
}
