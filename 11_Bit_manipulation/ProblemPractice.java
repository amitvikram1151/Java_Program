public class ProblemPractice {

    //checking the power of two
    public static Boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    //couting the setBit 
    public static int countSetBit(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) count++;
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] a) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(countSetBit(10));
    }
}
