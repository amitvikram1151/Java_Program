import java.util.Scanner;

public class matrix{
    public static boolean search(int matrix[][], int key) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("found on cell (" + i + ","+ j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        System.out.println("please enter into matrix : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output of matrix
        System.out.println("output of matrix is : ");
        for(int i = 0; i < 3; i++) {
            for(int j= 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean result = search(matrix, 5);
        System.out.println("result :" + result);

    }
}