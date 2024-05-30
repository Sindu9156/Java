import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.println("Enter the number of rows for matrix 1:");
        int r1 = s.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int c1 = s.nextInt();
        int[][] matrix1 = new int[r1][c1];

        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        
        System.out.println("Enter the number of rows for matrix 2:");
        int r2 = s.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int c2 = s.nextInt();
        int[][] matrix2 = new int[r2][c2];

        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        
        if (c1 != r2) {
            System.out.println("Matrices cannot be multiplied. Column count of matrix 1 must be equal to row count of matrix 2.");
            return;
        }

        int[][] result = new int[r1][c2];

        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

       
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
