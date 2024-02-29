package JavaNotesForProfessionals.cap17_DaTeANDtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.JULY, 27, 8, 0);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime parsed = LocalDateTime.parse("2016-07-27T07:00:00");

        // Date and time with zone information

        ZoneId zoneId = ZoneId.of("UTC+2");

    }
}
