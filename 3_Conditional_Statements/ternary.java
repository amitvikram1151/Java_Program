
import java.util.*;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //example 1
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        String type = ((number % 2) == 0) ? "Even" : "odd";
        System.out.println(type);

        System.out.println();
        
        //example 2
        System.out.print("Enter your Marks : ");
        int marks = sc.nextInt();
        String reportCard = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(reportCard);

        sc.close();

    }
}
