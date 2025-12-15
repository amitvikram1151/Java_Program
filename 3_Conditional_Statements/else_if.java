
import java.util.*;
public class else_if {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Adult");
        }else if (age >= 13 && age < 18) {//only if block excutesa fter if condition will
            System.out.println("teenagers");
        } else {
            System.out.println("Child");
        sc.close();
        }
        
    }
    
}
