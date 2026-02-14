public class Exponination {
    public static int calcPow(int x, int n) {
        if(n == 1) {
            return x;
        }
        return x * calcPow(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(calcPow(2, 5));
    }
}


