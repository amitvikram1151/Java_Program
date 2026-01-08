public class CountVowel {
    public static int countLowerCaseVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }
        }
        return count;
    }
    public static void main(String[] a) {
        String str = "i am amit vikram";
        System.out.println("no of vowels in string is : " + countLowerCaseVowels(str));
        String str2 = "ApnaCollege".replace("l", " ");
        System.out.println(str2);
    }
}
