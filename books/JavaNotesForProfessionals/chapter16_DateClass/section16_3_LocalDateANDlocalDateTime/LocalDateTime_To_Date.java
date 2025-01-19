package books.JavaNotesForProfessionals.chapter16_DateClass.section16_3_LocalDateANDlocalDateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTime_To_Date {
    public static void main(String[] args) {
        Date date = Date.from(Instant.now());
        ZoneId defaultZoneId = ZoneId.systemDefault();

        // Date to LocalDateTime
        LocalDateTime localDateTime = date.toInstant().atZone(defaultZoneId).toLocalDateTime();

        // LocalDate to Date
        Date out =Date.from(localDateTime.atZone(defaultZoneId).toInstant());
    }
}
