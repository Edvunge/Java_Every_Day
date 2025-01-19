package books.JavaNotesForProfessionals.chapter16_DateClass.section16_3_LocalDateANDlocalDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDate_To_Date {
    public static void main(String[] args) {
        Date date = Date.from(Instant.now());
        ZoneId defaultZoneId = ZoneId.systemDefault();

        // Date to LocalDate
        LocalDate localDate = date.toInstant().atZone(defaultZoneId).toLocalDate();

        // Local to Date
        Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
    }
}
