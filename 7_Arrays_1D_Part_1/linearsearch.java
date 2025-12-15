import java.util.Scanner;

public class linearsearch {

    public static int linearSearch(int arr[], int n,int target) {
        for(int i = 0; i < n; i++) {
            if(target == arr[i]) {
                return target; // return i for index
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = new int[100];
        int n = 10;
         Scanner sc = new Scanner(System.in);
         System.out.println("input inside main array : ");
        for(int i= 0; i< n; i++) {
            marks[i] = sc.nextInt();
        }

        int result = linearSearch(marks, n, 25);
        if(result == -1) {
            System.out.println("target not found");
        } else {
            System.out.println("target found");
        }
        sc.close();

        
    }
}
