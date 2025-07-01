package tests;

import model.OddEvenComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddEvenTest {

    Integer [] origin;

    @BeforeEach
     void setUp(){
        origin = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 3};
    }

    @Test
    void testEvenOdd(){
        Integer[] expected = {2,4,6,8,9,7,5,3,3,1};

        System.out.println("\n=== Test: Even before Odd ===");
        System.out.println("Before: " + Arrays.toString(origin));
        OddEvenComparator od = new OddEvenComparator();
        Arrays.sort(origin, od);
        System.out.println("After:  " + Arrays.toString(origin));

        assertArrayEquals(expected, origin);

    }

    @Test
    void onlyEven(){
        Integer[] evenArray = {8, 2, 6, 4, 10};
        Integer[] expected = {2, 4, 6, 8, 10};

        System.out.println("\n=== Test: Only Even Numbers ===");
        System.out.println("Before: " + Arrays.toString(evenArray));
        Arrays.sort(evenArray, new OddEvenComparator());
        System.out.println("After:  " + Arrays.toString(evenArray));

        assertArrayEquals(expected, evenArray);
    }

    @Test
    void onlyOdd(){
        Integer[] oddArray = {7, 1, 9, 5, 3};
        Integer[] expected = {9, 7, 5, 3, 1};

        System.out.println("\n=== Test: Only Odd Numbers ===");
        System.out.println("Before: " + Arrays.toString(oddArray));
        Arrays.sort(oddArray, new OddEvenComparator());
        System.out.println("After:  " + Arrays.toString(oddArray));

        assertArrayEquals(expected, oddArray);
    }

    @Test
    void  testDuplicates(){
        Integer[] arrD = {4, 2, 2, 3, 3, 1, 4};
        Integer[] expected = {2, 2, 4, 4, 3, 3, 1};

        System.out.println("\n=== Test: With Duplicates ===");
        System.out.println("Before: " + Arrays.toString(arrD));
        Arrays.sort(arrD, new OddEvenComparator());
        System.out.println("After:  " + Arrays.toString(arrD));

        assertArrayEquals(expected, arrD);
    }

    @Test
    void testWithNegativeNumbers(){
        Integer[] arrN = { -3, -2, -5, -4, 1, 2, 3, 4 };
        Integer[] expected = { -4, -2, 2, 4, 3, 1, -3, -5 };

        System.out.println("\n=== Test: With Negative Numbers ===");
        System.out.println("Before: " + Arrays.toString(arrN));
        Arrays.sort(arrN, new OddEvenComparator());
        System.out.println("After:  " + Arrays.toString(arrN));
        assertArrayEquals(expected, arrN);

    }

    @Test
    void testEmptyArray(){
        Integer[] arrEmpty = {};

        System.out.println("\n=== Test: Empty Array ===");
        Arrays.sort(arrEmpty, new OddEvenComparator());
        System.out.println("After: " + Arrays.toString(arrEmpty));
        assertArrayEquals(new Integer []{}, arrEmpty);
    }








}
