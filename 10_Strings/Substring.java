public class Substring {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for(int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = new String("Hello World");
        System.out.println("substring is : " + substring(str, 0, 5));
        // with help of inbuilt function
        System.out.println("substring with inbuilt function : " + str.substring(0,5));

    }
}