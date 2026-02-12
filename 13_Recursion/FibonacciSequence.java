//print Nth fibonaaci number
public class FibonacciSequence {
    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        
        int nthfib = fib(n-1) + fib(n-2);
        return nthfib;
    }
    public static void main(String[] args) {
        System.out.println(fib(8 ));
    }

}
