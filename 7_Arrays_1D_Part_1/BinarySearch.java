public class BinarySearch {
    // first sort the array with help of recursion 
    public static int bianrySearch(int arr[], int data,int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if(data == arr[mid]) {
            return mid;
        }
        if(data > arr[mid]) {
            return bianrySearch(arr, data, mid + 1, end);
        }
        else{
            return bianrySearch(arr, data, start, mid-1);
        }

        
    }

    public static int bSearch(int arr[], int data) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(data == arr[mid]) {
                return mid;
            }
            if(data > arr[mid]) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        int arr[] = {10,11,13,15,17,18,19,21,42,45,54,65};
        System.out.println(bianrySearch(arr, 21, 0, arr.length -1 ));
        System.out.println(bSearch(arr, 450));
    }
}