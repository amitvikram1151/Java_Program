
import java.util.*;
public class TypeCasting1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a; //int forcing convert float datatype to integer datatype (int)
        System.out.println(b);
        sc.close();
    }
    
}
// type casting is also called narrowing conversion or explicit conversion