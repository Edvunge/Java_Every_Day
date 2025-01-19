package books.JavaNotesForProfessionals.chapter16_DateClass.section16_6_LocalTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalTime {
    public static void main(String[] args) {
        java.time.LocalTime localTime = java.time.LocalTime.now();
        //Instant instant = localTime.atDate(LocalDate.of(A_YEAR, A_MONTH, A_DAY)).atZone(ZoneId.systemDefault()).toInstant();
        //Date time = Date.from(instant);
    }
}
