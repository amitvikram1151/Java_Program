public class ProblemPractice2 {

    public static int xorcheck(int n) {
        return n^n;
    }
    //swaping two number without using third variable
    public static void swap(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("value of a is : " + a);
        System.out.println("value of b is : " + b);
    }

    // it work only when all duplicate(in pair) one not duplicate
    public static int checkDuplicate(int arr[]) {
        int result = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     result ^= arr[i];
        // }
        for(int x : arr) {
            result ^=x;
        }
        return result;
    }

    // add 1 integer using bit manuplation
    // shotcut is -~x;

    public static int addInteger(int n) {
        int mask = 2; // what to add
        while((n & mask) != 0) {
            n = n ^ mask;
            mask <<= 1;

        }
        n = n ^ mask;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(xorcheck(6));
        swap(2, 5);
        int arr[] = {1,2,1,2,4};
        System.out.println(checkDuplicate(arr));
        System.out.println(addInteger(5));
    }
}
