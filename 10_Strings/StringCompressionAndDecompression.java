/* 
string compression - > "aaabbcccdd" -> "a3b2c3d2"
 */
/*
string decompressin -> "a3b2c3d2" -> "aaabbcccdd" */

public class StringCompressionAndDecompression {


    public static String comprressionString(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            sb.append(str.charAt(i));
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static String decompressionString(String str) {
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(str.charAt(i))) {
                sb.append(ch);
            } else if(Character.isDigit(str.charAt(i))) {
                count = Character.getNumericValue(ch);
                for(int j = 0; j < count-1; j++) {
                    sb.append(str.charAt(i-1));
                }
            }   
        }
        return sb.toString();
    }
    public static String optimisedDecompress(String str) {
        StringBuilder sb = new StringBuilder("");
        char lastchar = 0;
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                sb.append(ch);
                lastchar = ch;
            } else if (Character.isDigit(ch)) {
                count = 0;
                while(i < str.length() && Character.isDigit(str.charAt(i))) {
                    count = count * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                for(int j = 0; j < count - 1; j++) {
                    sb.append(lastchar);
                }
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "aaabbcccdd";
        //System.out.println(comprressionString(str1));
        String str2 = "a3b2c3d2";
        // System.out.println(decompressionString(str2));
        System.out.println(optimisedDecompress(str2));
    }
}
