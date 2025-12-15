public class calculateBinomial {
    public static int fact(int n) {
        int fact  = 1;
        for(int i = 1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binomial(int x, int y) {
        int n = fact(x);
        int r = fact(y);
        int nMinusR = fact(x-y);

        int result = n/(r*nMinusR);
        return result;   
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(binomial(n, r));

    }
}
