package telRan.timeHW.tests;

import org.junit.jupiter.api.Test;
import telRan.timeHW.tools.DateOperation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateOperationTest {
    @Test
    void testGetAge() {

        String[] testDates = {"12/04/1961", "1961-10-10"};

        System.out.println("__________Testing getAge ________");
        for (int i = 0; i < testDates.length; i++) {
            int age = DateOperation.getAge(testDates[i]);
            System.out.println("  Date: " + testDates[i] + "  Age: " + age);

            assertEquals(64, DateOperation.getAge("12/04/1961"));
            assertEquals(63, DateOperation.getAge("1961-10-10"));
        }
    }


    @Test
    void testSortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};

        System.out.println("______ Before sorting ________");
        for (int i = 0; i < dates.length; i++) {
            System.out.println("  " + dates[i]);
        }

        System.out.println("______ After sorting _________");
        for (int i = 0; i < actual.length; i++) {
            System.out.println("  " + actual[i]);
        }
        assertArrayEquals(expected, actual);
    }

}
