package telran.multiarray.tools;

public class Matrix {


    public static int[][] transp(int[][] matrix1) {
        if (matrix1.length == 0) {
            return new int[0][0];
        }
        int row = matrix1.length;
        int column = matrix1[0].length;

        int[][] result = new int[column][row];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[j][i] = matrix1[i][j];
            }
        }
        return result;
    }

    public static int sum(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
    /*
    result[i][j] = matrix1[i][0]*matrix2[0][j]
             + matrix1[i][1]*matrix2[1][j]
             + ...
             + matrix1[i][n-1]*matrix2[n-1][j]
     */

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {//количество столбцов
                result[i][j] = calcMatrixCell(matrix1, matrix2, i, j);
            }
        }

        return result;
    }
    private static int calcMatrixCell( int[][] m1, int [][] m2, int i, int j){
        int sum = 0;
        for (int index = 0; index < m1[0].length; index++) {
            sum+= m1[i][index] * m2[index][j];
        }
        return sum;
    }

}
