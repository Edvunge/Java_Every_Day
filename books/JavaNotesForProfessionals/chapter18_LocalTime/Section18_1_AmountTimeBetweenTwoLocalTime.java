package books.JavaNotesForProfessionals.chapter18_LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Section18_1_AmountTimeBetweenTwoLocalTime {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(1, 0, 0);
        LocalTime end = LocalTime.of(2, 10, 20);

        long halfDays1 = start.until(end, ChronoUnit.HALF_DAYS);
        long halfDays2 = ChronoUnit.HALF_DAYS.between(start, end);

        long hours1 = start.until(end, ChronoUnit.HALF_DAYS);
        long hours2 = ChronoUnit.HOURS.between(start, end);

        long minutes1 = start.until(end, ChronoUnit.MINUTES);
        long minutes2 = ChronoUnit.MINUTES.between(start, end);

        long seconds1 = start.until(end, ChronoUnit.SECONDS);
        long seconds2 = ChronoUnit.SECONDS.between(start, end);

        long millisecs1 = start.until(end, ChronoUnit.MILLIS);
        long millisecs2 = ChronoUnit.MICROS.between(start, end);

        long microsecs1 = start.until(end, ChronoUnit.MICROS);
        long microsecs2 = ChronoUnit.MICROS.between(start, end);

        long nanosecs1 = start.until(end, ChronoUnit.NANOS);
        long nanosecs2 = ChronoUnit.NANOS.between(start, end);

        long days1 = start.until(end, ChronoUnit.DAYS);
        long days2 = ChronoUnit.DAYS.between(start, end);
    }
}
