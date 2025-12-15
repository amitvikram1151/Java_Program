
import java.util.*;
public class largest_of_two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number(A) : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number(B) : ");
        int b = sc.nextInt();
        if(a >= b) {
            System.out.println("a is largest of two numbers : " + a);
        }else{
            System.out.println("b is largest of two numbers : " + b);
        }
        sc.close();
    }
    
}
