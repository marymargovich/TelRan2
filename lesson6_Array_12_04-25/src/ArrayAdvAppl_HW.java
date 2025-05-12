public class ArrayAdvAppl_HW {
    public static void main(String[] args) {
        int[] arr = new int[10];
        printArray(arr);
        fillArray(arr, 10, 99);
        printArray(arr);

        int res = sumArray(arr);
        System.out.println("Sum1 = " + res);
        res = sumArray2(arr);
        System.out.println("Sum2 = " + res);


        double avg = average(arr);
        System.out.println("Avg1 = " + avg);
        avg = average2(arr);
        System.out.println("Avg2 = " + avg);


        res = max(arr);
        System.out.println("max1 = " + res);
        res = max2(arr);
        System.out.println("max2 = " + res);


        res = search(arr, arr[7]);
        if (res == -1){
            System.out.println("not found");
        }else{
        System.out.println("Index = " + res);}


    }

    private static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }



    private static int max(int[] arr) {
        int max = arr[0];
        for ( int i = 0; i < arr.length; i++){
            if ( arr [i] > max)
                max = arr[i];
        }
        return max;
    }
    private static int max2(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    private static double average(int[] arr) {
        int average = 0;

        for ( int i =0; i < arr.length; i++){
            average += arr[i]/arr.length;
        }
        return average;
    }
    private static double average2(int[] arr) {
        int average = 0;

        for (int i : arr) {
            average += i / arr.length;
        }
        return average;
    }



    private static int sumArray(int[] arr) {
        int sum = 0;
        for ( int i  = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
    private static int sumArray2(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
        System.out.println();
    }

    private static void fillArray(int[] arr, int from, int to) {
        for ( int i = 0; i < arr.length; i++){
            arr[i]= (int) ( from + Math.random() * ( to - from + 1));
        }
    }

}
