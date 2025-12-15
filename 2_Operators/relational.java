
import java.util.*;
public class relational {

    public static void main(String[] args) {
        // int a = 20;
        // int b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first no :");
        int a = sc.nextInt();
        System.out.print("enter the second no :");
        int b = sc.nextInt();
        System.out.println("Both number are equall : " + (a==b));
        System.out.println("Both no are not equall : " + (a!=b));
        System.out.println(a>b);    // similary you can also write...
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        sc.close();
    }
}