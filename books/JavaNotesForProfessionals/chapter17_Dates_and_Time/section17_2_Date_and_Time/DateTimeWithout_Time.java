package books.JavaNotesForProfessionals.chapter17_Dates_and_Time.section17_2_Date_and_Time;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeWithout_Time {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.JULY, 27, 8, 0);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime parsed = LocalDateTime.parse("2016-07-27T07:00:00");

        System.out.println("Date Time: "+ dateTime);
        System.out.println("Now: "+ now);
        System.out.println("Parsed: "+ parsed);
    }
}
