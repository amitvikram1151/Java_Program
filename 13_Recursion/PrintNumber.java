public class PrintNumber {
    public static void printIncresing(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        printIncresing(n-1);
        System.out.println(n);
    }

    public static void printDecresing(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecresing(n-1);
    }

    public static void main(String[] args) {
        printIncresing(10);
        System.out.println();
        printDecresing(10);

    }
}