public class PairSumOptimise {
    public static int[] pairsum(int arr[], int target) {
        int i = 0; 
        int j = arr.length -1;
        while(i < j) {
            int pairsum = arr[i] + arr[j];
            if(pairsum > target) {
                j--;
            }
            else if(pairsum < target) {
                i++;
            }
            else{
                return new int[] {i,j};
            }
        }
        return new int[] {-1, -1};
        
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 13;
        int result[] = pairsum(arr, target);
        System.out.println("1st index are : " + result[0] + "\n" +"2nd index are : " + result[1]);
    }
}
