package arrays.tools;

public class ArraysTools {

    public static int binarySearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == value) {
                return mid;        }
            if (arr[mid] > value) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -l - 1;
    }


    public static void selectSort(int[] arr)
    {    for (int i = 0; i < arr.length - 1; i++)
    {        int index = indexMinInRange(arr, i + 1);
        if (arr[i] > arr[index]) {
            int t = arr[i];
            arr[i] = arr[index];
            arr[index] = t;
        }
    }
    }


    public static int indexMinInRange(int[] arr, int start)
    {    int index = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[index] > arr[i])
            {            index = i;        }
        }    return index;}


    public static void bubbleSort1(int[] arr)
    {    while (bubbling(arr)) ;}


    private static boolean bubbling(int[] arr)
    {    boolean res = false;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                res = true;
            }
        }
        return res;}


    public static void bubbleSort(int[] arr)
    {    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    }


    public static void fillArray(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (from + Math.random() * (to - from + 1));
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

}

