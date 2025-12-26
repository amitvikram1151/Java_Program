public class spiral {
    public static void sprialPrinting(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        int tc = matrix.length * matrix[0].length;
        int count = 0;
        while(count < tc) {
            for(int j = startRow; j<= endColumn && count < tc; j++) {
                System.out.print(matrix[startRow][j] + " ");
                count++;
            }
            startRow++;
            for(int i = startRow; i <= endRow && count < tc; i++) {
                System.out.print(matrix[i][endColumn] + " ");
                count++;
            }
            endColumn--;
            for(int j = endColumn; j>= startCol && count < tc; j--) {
                System.out.print(matrix[endRow][j] + " ");
                count++;
            }
            endRow--;
            for(int i = endRow; i>= startRow && count < tc; i--) {
                System.out.print(matrix[i][startCol] + " ");
                count++;
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                        };
        sprialPrinting(matrix);
        
    }

    
}
