public class BinaryStringProblem {
    public static void binaryStringProblem(int n, int lastPosition, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        if(lastPosition == 0) {
            binaryStringProblem(n-1, 0, str + "0");
            binaryStringProblem(n-1, 1, str + "1");
        }else {
            binaryStringProblem(n-1, 0, str + "0");
        }
    }
    public static void main(String[] args) {
        binaryStringProblem(3, 0, "");
    }
}
