//for a given string convert each the first letter of each word to uppercase
public class FirstLetterUpperCase {
    public static String convertUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        str = str.toLowerCase();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hii, my naMe is amIt vikrAm";
        System.out.println(convertUpperCase(str));
    }
}
