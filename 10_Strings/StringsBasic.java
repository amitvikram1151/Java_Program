import java.util.Scanner;

public class StringsBasic {
    
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("abcd");
        Scanner sc = new Scanner(System.in);
        System.out.print("lets check input in string : ");
        String name = sc.nextLine();
        System.out.println("you entered : " + name);
        System.out.println("length is : " + name.length());

        // string concatenation
        String firstName = "amit";
        String lastName = "vikram";

        String fullName = firstName + " " + lastName;
        System.out.println("example of string concentenation -> "+fullName);
        for(int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

    }
}
