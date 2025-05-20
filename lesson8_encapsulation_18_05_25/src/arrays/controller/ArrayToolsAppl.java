package arrays.controller;

import arrays.tools.ArraysTools;


public class ArrayToolsAppl {
    public static void main(String[] args) {
        int []arr = new int [10];

        ArraysTools.fillArray(arr, 10, 99);
        ArraysTools.printArray(arr);
        ArraysTools.bubbleSort (arr);
        ArraysTools.printArray(arr);
    }
}
