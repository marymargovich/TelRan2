package telran.multiarray.tests;

import org.testng.annotations.Test;
import telran.multiarray.tools.Matrix;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatrixTest {

    int [][] matrix1 = {{1,2,3}}; //1x3
    int [][] matrix2 = {{1},{2},{3}}; //3x1

    @Test
   void testSum(){
        assertEquals(6, Matrix.sum(matrix1));
        assertEquals(6, Matrix.sum(matrix2));

        int[][] empty = new int[0][0];
        assertEquals(0, Matrix.sum(empty));

    }


    @Test
    void testTrans(){//повернуть = транспарировать
        assertArrayEquals(matrix2, Matrix.transp(matrix1));
        assertArrayEquals(matrix1, Matrix.transp(Matrix.transp(matrix1)));//обратно?

        int[][] empty = new int[0][0];//пустая
        assertArrayEquals(empty, Matrix.transp(empty));

    }

    @Test
    void testMultiply(){
        int [][] expected = {{14}};
        assertArrayEquals(expected,Matrix.multiply(matrix1, matrix2));
        int [][] arr1 = {{1,2,3}, {4,5,6}};
        int [][] arr2 = {{1,4}, {2,5}, {3,6}};
        int [][] arrExpected = {{14, 32},{32,77}};
        assertArrayEquals(arrExpected, Matrix.multiply(arr1, arr2));


    }



}
