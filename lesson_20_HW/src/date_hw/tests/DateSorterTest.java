package date_hw.tests;

import date_hw.model.DateSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSorterTest {
    @Test
    void testDates(){
        String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970" };
        String[] expected = { "16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010" };

        System.out.println("___________Test: sort dates_________");
        System.out.println("Before: ");
        printArrayInColumn(dates);

        Arrays.sort(dates, new DateSorter());

        System.out.println("After: ");
        printArrayInColumn(dates);

        assertArrayEquals(expected, dates);
    }


    private void printArrayInColumn(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  " + arr[i]);
        }
    }

}

