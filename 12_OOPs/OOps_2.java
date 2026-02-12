public class OOps_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "amit";
        s1.roll = 12;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s1.marks[0] = 20;
        s2.password = "xyz";

        for(int i = 0; i < s1.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
        //parammerized costructor
        // Student s3 = new Student("amit");
        // Student s4 = new Student(4);

        s2.display();
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("this is default constructor");
    }

    // //shallow copy constructor
    // Student(Student s1) {
    //     this();
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        this();
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    //constructor parametrized
    Student(String name) {
        this();
        this.name = name;
    }
    Student(int roll) {
        this();
        this.roll = roll;
    }

    void display() {
        String [] subjects = {"maths", "phyics", "chemistry"};
        System.out.println("name is " + name);
        System.out.println("roll no " + roll);
        System.out.println("password is " + password);
        for(int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
    }
    
}

 

    
    

   