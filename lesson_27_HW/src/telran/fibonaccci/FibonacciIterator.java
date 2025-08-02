package telran.fibonaccci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int size;
    private int i;
    int num1 =0;
    int num2 = 1;
    int numCurrent = 0;

    public FibonacciIterator(int size) {
        this.size = size-1;
        this.i = 0;
    }

    @Override
    public boolean hasNext() {
        return i <size;
    }

    @Override
    public Integer next() {
        numCurrent = num1+num2;
        num1=num2;
        num2 = numCurrent;
        i++;

        return numCurrent;
    }
}
