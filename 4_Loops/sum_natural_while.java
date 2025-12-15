
//sum of first n natural number..
import java.util.*;
public class sum_natural_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N for Sum : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum upto N is : "+ sum);
        sc.close();
        
    }
}

