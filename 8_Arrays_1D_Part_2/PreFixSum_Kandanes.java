// import java.util.Scanner;

public class PreFixSum_Kandanes{
    // prefix array
    public static void calculatePrefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for(int j = i ; j < arr.length; j++) {
                currentSum = (i == 0 )? prefix[j] : prefix[j] - prefix[i - 1];
            
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
           
        }
        System.out.print("maxsum of this array is : " + maxSum);

    }

    // kadanes algorithm

    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("maxmium sub array sum is : " +ms);
    }


    public static void main(String[] args) {
        /*  
        System.out.print("enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the value of array ... ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        */
        int arr[] = {1,-2,6,-1,3};
        calculatePrefixSum(arr);
        System.out.println();
        kadanes(arr);

        // sc.close();
    }
}
