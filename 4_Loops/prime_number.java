
import java.util.*;
public class prime_number {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean p = true;
        if(n == 2) {
            System.out.println("Its is prime number");
        } else {
           // for(int i=2; i<=n-1; i++)  // this is not a optimized code...
            for(int i=2; i<=Math.sqrt(n); i++)  //this iis optized code for larger number
            {
                if(n % i == 0){
                    p=false;
                }
            }
        }
        if(p == true) {
            System.out.println("its is prime number");
        } else {
            System.out.println("its is not prime number");
        }
        sc.close();
        
    }
    }
