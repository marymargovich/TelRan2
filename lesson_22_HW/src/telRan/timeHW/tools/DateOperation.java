package telRan.timeHW.tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class DateOperation  {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");

    public static int getAge(String birthDate) {
        LocalDate parseDate = LocalDate.parse(birthDate, FORMATTER);
        LocalDate currentDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(parseDate, currentDate);
        return (int) years;
    }


    public static String[] sortStringDates(String[] dates) {
        // загнать бы в коллекцию Map) но будем мучить компаратор
        String[] sortedDates = Arrays.copyOf(dates, dates.length);
        Comparator<String> comparator= (d1, d2) -> {
            LocalDate date1 = parseDate(d1);
            LocalDate date2 = parseDate(d2);
            return date1.compareTo(date2);};
        Arrays.sort(sortedDates, comparator);
        return sortedDates;
    }


    private static LocalDate parseDate(String dateStr){
        return LocalDate.parse(dateStr, FORMATTER);

    }
}


