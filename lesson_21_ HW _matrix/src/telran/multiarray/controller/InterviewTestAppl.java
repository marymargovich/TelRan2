package telran.multiarray.controller;

public class InterviewTestAppl {
    public static void main(String[] args) {
        int[][] arr = new int [100][100];
        long t1_1 = System.currentTimeMillis();
        fillArray(arr);
        long t2_1 = System.currentTimeMillis();
        System.out.println(t2_1 - t1_1);

        long t1 = System.currentTimeMillis();
        fillArrayOpt(arr);
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }


    private static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= i * j;

            }
        }
    }

    private static void fillArrayOpt( int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = i * i;
            for (int j = i+1; j < arr[i].length; j++) {
                arr[i][j] = arr[j][i] = i * j;

            }
        }
    }

}
