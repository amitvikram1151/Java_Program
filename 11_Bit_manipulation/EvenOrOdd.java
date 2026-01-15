import java.util.Scanner;

public class EvenOrOdd {

    public static int convertBinary(int n ) {
        int binNum = 0;
        int pow = 0;
        while(n > 0) {
            int rem = n % 2;
           // binaryForm = (binaryForm * 10) + rem;
           binNum = binNum + (rem * (int)Math.pow(10,pow));
            n = n / 2;
            pow++;
        }
        return binNum;
    }

    public static String checkEvenOrOdd(int binaryForm) {
        StringBuilder sb = new StringBuilder("");
        int n = binaryForm;
        if((n & 1) == 1) {
            sb.append("odd number");
        } else {
            sb.append("even number");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number : ");
        int n = sc.nextInt();

        int collectBinary = convertBinary(n);
        String result = checkEvenOrOdd(collectBinary);
        System.out.println(result);
        sc.close();


    }
}
