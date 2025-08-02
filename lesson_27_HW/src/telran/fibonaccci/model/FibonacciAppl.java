package telran.fibonaccci.model;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);



        Iterator<Integer> iterator =fibonacci.iterator();
        int sum =1;
        System.out.print("1");
        while (iterator.hasNext()){
            int number = iterator.next();
            sum += number;
            System.out.print( ", "+ number);

        }
        System.out.println("\nSum = "+ sum);

    }

    }
