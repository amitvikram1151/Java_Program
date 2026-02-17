public class FriendParing {
    public static int friendParing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendParing(n-1);
        int fnm2 = (n-1) * friendParing(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(friendParing(3));
    }
}
