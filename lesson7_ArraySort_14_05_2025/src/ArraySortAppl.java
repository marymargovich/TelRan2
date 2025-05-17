

public class ArraySortAppl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 10, 100);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
        bubbleSort2(arr);
        printArray(arr);
        int index = binarySearch(arr,arr[7]);
        System.out.println("Index = "+ index);


    }
    /*
    selectSort( int[arr])
    ***** максимальное количество видов сортировок?

     */
    public static int binarySearch( int[] arr, int value){
        int l = 0;
        int r = arr.length-1;
        while( l <=r ){
            int mid = (l+r)/2;
            if ( arr[mid]== value){
                return mid;
            }
            if( arr[mid]> value){
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }


    public static void bubbleSort( int[] arr){
        for (int i = 0; i < arr.length -1- i; i++) {
            for ( int j = 0; j < arr.length-1; j++){
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }


    public static void bubbleSort2( int[] arr){
        while (bubbling(arr));
        }



    private static boolean bubbling(int[] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    res = true;
                }
            }
        }return res;
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
// bubble sort
