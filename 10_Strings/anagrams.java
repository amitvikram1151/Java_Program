import java.util.*;
public class anagrams {
    public static Boolean checkAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check the lengh first 
        if(str1.length() == str2.length()){

            // String to char array
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);

            //array to string
            str1 = new String(a1);
            str2 = new String(a2);

            if(str1.equals(str2)) {
                return true;
            }
        }
        
        return false;
    } 
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println("Is String are anagrams : " + checkAnagrams(str1, str2));
    }
}
