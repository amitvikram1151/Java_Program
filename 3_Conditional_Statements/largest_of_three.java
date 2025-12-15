
import java.util.*;
public class largest_of_three {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();

        if(a > b && a > c) {
            System.out.println("A is largest");
        }
        else if(b > c) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
        sc.close();
    }
    
}
