import java.util.Scanner;

public class MaxSubArray {
    //brut force
    
    public static void printMaxSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currentSum = currentSum + arr[k];
                }
                System.out.println(" : current sum is "+ currentSum) ;
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximun sum of sub array is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter into array ");
        for(int i = 0; i< arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        printMaxSubArray(arr);
        sc.close();
    }

}
// it is brutforce type its time complexity is not good due to n^3
