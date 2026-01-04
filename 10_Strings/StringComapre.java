public class StringComapre {
    public static void main(String[] args) {
        String str1 = "tony";
        String str2 = "tony";
        String str3 = new String("tony");
        // its check at object level
        if(str1 == str2) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }

        if(str1 == str3) {
            System.out.println("string are equal ");
        } else {
            System.out.println("string are not equal ");
        }

        // check with equals function for chekcing

        if(str1.equals(str3)) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }
     }
}
// ALWAYS USE .equals for checking the string