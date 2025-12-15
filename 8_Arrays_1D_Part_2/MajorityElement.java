import java.util.*;
public class MajorityElement {
    public static int majorityElement(int arr[]) {
        // brust force
        for(int i = 0; i < arr.length; i++) {
            int freq = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    freq++;
                }
            }
             if(freq > arr.length/ 2) {
                    return arr[i];
                }
        }
        return -1;
    }
    // otimise code
    public static int optimseMajorityElement(int arr[]) {
        // sort the array
        Arrays.sort(arr);
        int freq = 1;
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                freq++;
            } else{
                freq = 1;
                ans = arr[i];
            }
            if(freq > arr.length/2) {
                return ans;
            }
        }
        return -1;
    }



    // moores voting algorithm is:

    public static int mooresAlgorithm(int arr[]) {
        int candidate = 0; // candidate is element of the array
        int freq = 0;
        for(int i = 0; i < arr.length; i++) {
            if(freq == 0) {
                candidate = arr[i];
            }
            if(arr[i] == candidate) {
                freq++;
            } else {
                freq--;
            }
        }

        int count = 0;
        for(int nums : arr) {
            if(candidate == nums) {
                count++;
            }
        }
        if(count > arr.length/2) {
            return candidate;
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {
        int brr[] = {1,2,1, 2,2};
        System.out.println("Brut force : "+ majorityElement(brr));
        System.out.println("optimise o(nlogn) using sorting : " + optimseMajorityElement(brr));
        System.out.println("using moores algorithm : " + mooresAlgorithm(brr));
    }
}
