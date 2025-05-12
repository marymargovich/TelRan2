public class ArrayAppl {
    public static void main(String[] args) {
        //ссылочный тип данных
        // нельзя поменять тип данных, нельзя изменить длину массива
         int [] arr = new int[5];
        System.out.println(arr);//ссылка на массив
         System.out.println(arr[2]);
         arr[2]= 100500;
         System.out.println(arr[2]);
         arr[1] = arr[2] * 2;
        System.out.println(arr[1]);
        System.out.println(arr.length);
        // index       0 1 2 3 4  5   6  7
        int[]primes = {2,3,5,7,11,13,15,17};
        System.out.println("array length : "+ primes.length);
        primes[2] = -1;
        System.out.println(primes[2]);
        int i = 1;
        System.out.println(primes[i]);
        i++;
        System.out.println(primes[i]);

        printArray(primes);


    }
    public static void printArray(int[]arr){
        for ( int i = 0; i < arr.length; i++){
            System.out.println("["+ i+ "] = "+ arr[i]);
        }
    }
}
