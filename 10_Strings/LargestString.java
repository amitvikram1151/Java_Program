import java.util.*;

public class LargestString {

    //checking only one largest
    public static String checkLargestString(String str[]){
        String largest = "";
        for(int i = 0; i < str.length; i++) {
            if(largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    }
    // comparing and storing in different array
    public static void arrangeTheString(String str[]) {
        for(int i = 0; i < str.length - 1; i++) {
            for(int j = 0; j < str.length - 1 - i; j++) {
                if(str[j+1].compareTo(str[j]) < 0) {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for(String fruit : str) {
            System.out.print(fruit + " ");
        }
    }
    public static void main(String[] args) {
        String fruits[] = {"mango", "banana", "apple"};
        System.out.println("largest string is : " + checkLargestString(fruits));
        arrangeTheString(fruits);
        // using inbuilt sorting ie, TIMSORT {merge sort, insertion sort}

        Arrays.sort(fruits);
        System.out.println();
        System.out.println("using inbuilt sorting");
        for(String nums : fruits) {
            System.out.print(nums + " ");
        }
    }
}
