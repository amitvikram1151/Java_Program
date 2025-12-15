import java.util.*;


// without parameter
// public class functionSum {
//     public static void calculateSum() {
//         System.out.println("in method");
//           Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int result = a + b;
//         System.out.println("sum of two number is : " + result);
//     }

//     public static void main(String[] args) {
//         System.out.println("calling method");
//         calculateSum();
//         System.out.println("method is exited");
//     }
// }

//with parameter

// you ca use a int return type then simply return x + y;
public class functionSum {
    public static void calculateSum(int x, int y) { 
        int result = x + y;
        System.out.println("sum of two number is : " + result);
    }

    public static void main(String[] args) {
        System.out.println("calling method");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b);
        // System.out.println("sum of two number is : " + result);
        System.out.println("method is exited");
        sc.close();
    }
} 
 
