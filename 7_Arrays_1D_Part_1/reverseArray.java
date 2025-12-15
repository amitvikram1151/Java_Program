import java.util.Scanner;

public class reverseArray {
    public static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while(i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        //printing the array
        System.out.println("print the reverse array");
        for(int i = 0; i< arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        sc.close();

    }
}
