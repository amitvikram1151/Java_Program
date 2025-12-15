import java.util.Scanner;

public class agrumnent {

    public static void update(int marks[], int n, Scanner sc ) {
        System.out.println("update a array: ");
        for(int i= 0; i< n; i++) {
            marks[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        System.out.println(a);
    }
    public static void main(String args[]) {
        int marks[] = new int[100];
        int n = 5;
         Scanner sc = new Scanner(System.in);
         System.out.println("input inside main array : ");
        for(int i= 0; i< n; i++) {
            marks[i] = sc.nextInt();
        }

        update(marks, n, sc);
        //printinf the marks
        System.out.println(" printing the array : ");
        for(int i = 0; i<n; i++) {
            System.out.print(marks[i] + " ");
        }
        sc.close();
    }
}

