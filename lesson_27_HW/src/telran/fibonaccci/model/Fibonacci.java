package telran.fibonaccci.model;

import telran.fibonaccci.FibonacciIterator;

import java.util.Iterator;

public class Fibonacci  implements Iterable <Integer> {
    // Fibonacci fibonacci = new Fibonacci(8)
   // ,1,1,2,3,5,8,13,21
    //генерировать итератором
    // print all numbers and reduce sum
    private int quantity;

    public Fibonacci(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fibonacci{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(quantity);
    }
}
