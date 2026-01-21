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

    //fast exponention

    public static int fastExponination(int a, int n) {
        int ans = 1;
       while(n > 0) {
        if((n & 1) != 0) {
            ans = ans * a;
        }
        a = a*a;
        n = n >> 1;
       }
       return ans;
    }

    public static void main(String[] a) {
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(countSetBit(10));
        System.out.println(fastExponination(3, 5));
    }
}
