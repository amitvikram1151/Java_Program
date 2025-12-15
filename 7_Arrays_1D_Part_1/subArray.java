public class subArray {

    public static void printSubArrayReverse(int arr[]) {
        for(int i = 0 ; i < arr.length; i++) {
            int end = arr.length;
            while(i <= end) {
                for(int j = i; j<end; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                end--;
            }
        }
    }

    public static void printSubArray(int arr[]) {
        int totalSubArray = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for(int k = i; k<=j ; k++) {
                    System.out.printf("%d ", arr[k]);
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Array : " + totalSubArray);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("In reverse order : ");
        printSubArrayReverse(arr);
        System.out.println("In Asscending order : ");
        printSubArray(arr);
    }
}