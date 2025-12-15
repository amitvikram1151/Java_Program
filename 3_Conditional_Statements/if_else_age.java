
import java.util.*;
public class if_else_age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int Age = sc.nextInt();
        if(Age >= 18) {
            System.out.println("adult : drive, volte");
        }
       // you can use more than one if in a single block one after one if(condition) will checked
        if(Age > 13 && Age < 18) {
            System.out.println("teenager");
        } 
        else {
            System.out.println("Not adult");
        }

        sc.close();
    }
}