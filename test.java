// only for testing purpose...
import java.util.*;
public class test {
    public static void countduplicate(int arr[]) {
        Arrays.sort(arr);
        int freq = 1;
        int count = 0;
        for(int i = 1; i< arr.length; i++) {
            if(arr[i - 1] == arr[i]) {
                freq++;
             
            } else{
                if(freq == 1) {
                count++;
                }
                freq = 1;
            }
        }  
        if(freq == 1) {
            count++;
        }  
        System.out.println("no of not duplicate is :" + count);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        countduplicate(arr);
    }
}

