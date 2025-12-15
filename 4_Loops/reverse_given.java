
import java.util.*;
public class reverse_given {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        int reverse = 0;
        while(a > 0) {
            int lastdigit = a % 10;
            reverse = (reverse * 10) + lastdigit;
            a = a/10;
        }
        System.out.println("Reverse of given Number : "+ reverse);
        sc.close();

    }
}
