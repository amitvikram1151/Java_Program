public class StaticExample {
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.setName("DAV");
       System.out.println(Student.calculateMarks(3,   54, 54));
       System.out.println(s1.getName());
;
    }
}
class Student {
    //static method
    static int calculateMarks(int phy, int chem, int math) {
        return (phy + chem + math) / 3;
    }
    String name;
    int roll;
    //static variable
    static String schoolName;

    void setName(String schoolName) {
        this.schoolName = schoolName;
    }

    String getName() {
        return this.schoolName;
    }

}
