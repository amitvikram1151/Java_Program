public class Palindrome {
    public static void checkpalidrome(String str) {
        for(int i = 0; i < str.length() / 2 ; i++) {
            if(str.charAt(i) == str.charAt(str.length()-1 - i)) {
                continue;
            }
            else {
                System.out.println("string is not pallidrome");
                return;
            }
        }
        System.out.println("sting is palidrome ");

    }
    public static void main(String[] args) {
        String str = "racercar";
        checkpalidrome(str);
    }
}
