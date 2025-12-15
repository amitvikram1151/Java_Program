
import java.util.*;
public class switch_ex {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ( 1-3 ) : ");
        int number = sc.nextInt();
        // we can use character instead of number(integer)
        switch (number) {
            case 1 : System.out.println("samosa");
                       break;
            case 2 : System.out.println("momos");
                       break;
            case 3 : System.out.println("mamgo shake");
                       break;
            default : System.out.println("we wake up");
        }
        sc.close();
    }
    
}
