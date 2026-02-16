public class Exponination {

    public static int calcPow(int x, int n) {
        if(n == 1) {
            return x;
        }
        return x * calcPow(x, n-1);
    }

    public static int optimisedCalPow(int x, int n) {
        //base case 
        if(n == 1) {
            return x;
        }

        // NOT OPTIMISED

        // if(n % 2 == 0) {
        //     return optimisedCalPow(x, n/2) * optimisedCalPow(x, n/2);
        // } else {
        //     return  x * optimisedCalPow(x, n/2) * optimisedCalPow(x, n/2);
        // }


        // OPTIMISED
        int halfPow = optimisedCalPow(x, n/2);
        int halfPowSq = halfPow * halfPow;

        if(n % 2 == 0) {
            return halfPowSq;
        } else {
            return x * halfPowSq;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcPow(2, 25));
        System.out.println(optimisedCalPow(2, 25));
    }
}


