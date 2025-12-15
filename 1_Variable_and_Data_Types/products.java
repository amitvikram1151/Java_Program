
import java.util.*;

public class products {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        int product = a*b;
        System.out.print("Product of Two Number is : ");
        System.out.println(product);
        sc.close();
    }
    
}
