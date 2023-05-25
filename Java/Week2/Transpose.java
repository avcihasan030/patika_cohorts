import java.util.Random;

public class Transpose {
    public static void main(String[] args) {
        Random _random = new Random();
        int _row, _col;
        _row = _random.nextInt(5) + 1;
        _col = _random.nextInt(5) + 1;

        int[][] matrix = new int[_row][_col];
        int[][] transpose = new int[_col][_row];

        // initialize each cells of matrix
        _initialize(_random, matrix);

        System.out.println("Matrix: ");
        // display unchanged matrix
        printMatrix(_row, _col, matrix);

        System.out.println("- - - - - - - - - -");
        // transpose the matrix
        transposeMatrix(_row, _col, matrix, transpose);

        // display transpose of matrix on the screen
        System.out.println("Transpose: ");
        printMatrix(_col, _row, transpose);

    }

    // method passes each element of the matrix to tranpose
    private static void transposeMatrix(int _row, int _col, int[][] matrix, int[][] transpose) {
        for (int i = 0; i < _row; i++) {
            for (int j = 0; j < _col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
    }

    // method displays matrix elements on the screen
    private static void printMatrix(int _row, int _col, int[][] matrix) {
        for (int i = 0; i < _row; i++) {
            for (int j = 0; j < _col; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    // method initializes the matrix and assigns values to each elements
    private static void _initialize(Random _random, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = _random.nextInt(10);
            }
        }
    }
}
