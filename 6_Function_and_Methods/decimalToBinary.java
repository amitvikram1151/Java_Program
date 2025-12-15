import java.util.Scanner;

public class decimalToBinary {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            decNum = decNum / 2;
            pow++;
        }
        System.out.println("binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Decimal number : ");
        int decNum = sc.nextInt();
        decToBin(decNum);
        sc.close();


    }
}
// we can also do it simple by simple by making return type ..