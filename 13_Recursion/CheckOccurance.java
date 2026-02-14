public class CheckOccurance {

    //first occurance
    public static int checkFirstOccurance(int[] arr, int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(key == arr[i]) {
            return i;
        } else {
            return checkFirstOccurance(arr, key, i+1);
        }
    }

    //second occurance
    public static int checkLastOccurance(int[] arr, int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        int isFound = checkLastOccurance(arr, key, i+1);

        // logic 1
        // if(isFound == -1 && arr[i] == key) {
        //     return i;
        // }
        // return isFound;

        //logic 2
        if(isFound != -1) {
            return isFound;
        }
        if(key == arr[i]) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5};
        System.out.println(checkFirstOccurance(arr, 5, 0));
        System.out.println(checkLastOccurance(arr, 2, 0));
    }
}
