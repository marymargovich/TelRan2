package date_hw.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class DateSorter implements Comparator<String> {


    @Override
    public int compare(String d1, String d2) {
        LocalDate date1 = parseDate(d1);
        LocalDate date2 = parseDate(d2);
        return date1.compareTo(date2);
    }

    private static LocalDate parseDate(String dateStr){
        DateTimeFormatter dash = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter slash = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (dateStr.contains("/")) {
            return LocalDate.parse(dateStr, slash);
        } else {
            return LocalDate.parse(dateStr, dash);
        }

    }

    /*
    @Override
    public int compare(String d1, String d2) {
         DateTimeFormatter f1 = d1.contains("/") ? DateTimeFormatter.ofPattern("dd/MM/yyyy")
                 : DateTimeFormatter.ofPattern("dd-MM-yyyy");
         DateTimeFormatter f2 = d2.contains("/") ? DateTimeFormatter.ofPattern("dd/MM/yyyy")
                 : DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(d1, f1);
        LocalDate date2 = LocalDate.parse(d2, f2);

        return date1.compareTo(date2);
    }
     */

    /*
    Implement a comparator that sorts an array of
     date strings in chronological order.
The strings use either "dd-MM-yyyy" or "dd/MM/yyyy" format.
Use LocalDate for comparison.
Your code must pass the test below.
     */

}
