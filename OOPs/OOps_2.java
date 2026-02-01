public class OOps_2 {
    public static void main(String[] args) {
        Student s1 = new Student("amit vikram");
        s1.display();
    }
}

class Student {
    String name;
    int roll;
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
}

