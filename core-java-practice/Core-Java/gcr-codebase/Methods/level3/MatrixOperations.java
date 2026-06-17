import java.util.*;

class MatrixOperations {
    public int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int r = matrixA.length;
        int c = matrixA[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int r = matrixA.length;
        int c = matrixA[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    public int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rA = matrixA.length;
        int cA = matrixA[0].length;
        int cB = matrixB[0].length;
        int[][] result = new int[rA][cB];
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cB; j++) {
                for (int k = 0; k < cA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public int[][] transposeMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] transposed = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public int findDeterminant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][2]);
    }

    public int findDeterminant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public double[][] findInverse2x2(int[][] m) {
        int det = findDeterminant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = (double) m[1][1] / det;
        inv[0][1] = (double) -m[0][1] / det;
        inv[1][0] = (double) -m[1][0] / det;
        inv[1][1] = (double) m[0][0] / det;
        return inv;
    }

    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        MatrixOperations mo = new MatrixOperations();
        int[][] a = mo.generateRandomMatrix(2, 2);
        int[][] b = mo.generateRandomMatrix(2, 2);
        System.out.println("Matrix A:");
        mo.displayMatrix(a);
        System.out.println("Matrix B:");
        mo.displayMatrix(b);
        System.out.println("Sum:");
        mo.displayMatrix(mo.addMatrices(a, b));
    }
}