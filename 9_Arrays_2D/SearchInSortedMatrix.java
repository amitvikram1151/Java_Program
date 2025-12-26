public class SearchInSortedMatrix {
    public static void stairCaseSearch(int matrix[][], int key) {
        int row = 0, cols = matrix.length - 1;

        while(row < matrix.length && cols >= 0) {
            if(matrix[row][cols] == key) {
                System.out.println("element found on (" + row + "," + cols + ")");
                return;
            }
            else if( key > matrix[row][cols]) {
                row++;
            }
            else{
                cols--;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        //key
        int key = 33;
        stairCaseSearch(matrix, key);
    }
}
