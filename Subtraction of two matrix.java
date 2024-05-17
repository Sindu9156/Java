public class Main{

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] Matrix1 = { {2, 3, 4}, {5, 2, 3} };
        int[][] matrix2 = { {-4, 5, 3}, {5, 6, 3} };

        
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = Matrix1[i][j] - matrix2[i][j];
            }
        }

    
        System.out.println("Subtraction of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
