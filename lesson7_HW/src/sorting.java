public class sorting {
    public static void main(String[] args) {

        System.out.println("________Task 1____Selection Sorting ");
        int[] arr = {4, 55, 6, 78, 23, 10};
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        selectionSorting(arr);
        System.out.println("Sorted");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        selectionSorting2(arr);
        System.out.println("Sorted 2");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("_______TASK 2____insertion Sort");
        int[] array = {4, 5, 6, 777, 77, 33, 5, 7};
        for (int item : array) {
            System.out.print(item + " ");}

            System.out.println();
            insertionSort(array);
            System.out.println("Sorted");
            for (int item : array) {
                System.out.print(item + " ");
            }


        }
        public static void selectionSorting ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int place = i;
                int min = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        place = j;
                        min = arr[j];
                    }
                }
                arr[place] = arr[i];
                arr[i] = min;
            }
        }

        public static void selectionSorting2 ( int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                if (minIndex != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
        public static void insertionSort ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > current) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = current;


            }
        }

    }

