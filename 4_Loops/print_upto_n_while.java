
import java.util.*;
public class print_upto_n_while {
    public static void main(String[] args) {
        System.out.print("Enter the N : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 1;
        while(counter <=  N) {
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
        sc.close();

    }

    
}
