public class factorial {
    public static int fact(int x) {
        int fact = 1;
        for(int i = 1; i<=x; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println(result);
    }
}
