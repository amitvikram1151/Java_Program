import java.util.Scanner;

public class EvenOrOdd {

    public static int convertBinary(int n ) {
        int binaryForm = 0;
        while(n > 0) {
            int lastDigit = n % 2;
            binaryForm = (binaryForm * 10) + lastDigit;
            n = n / 2;
        }
        return binaryForm;
    }

    public static Boolean checkEvenOrOdd(int binaryForm) {
       return (binaryForm & 1) == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number : ");
        int n = sc.nextInt();

        int collectBinary = convertBinary(n);
        Boolean result = checkEvenOrOdd(collectBinary);
        System.out.println(result);


    }
}
