package books.JavaNotesForProfessionals.chapter17_Dates_and_Time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Section17_3_OperationsDates_and_Times {
    public static void main(String[] args) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDateTime anHourFromNow = LocalDateTime.now().plusHours(1);
        Long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusDays(3));
        Duration duration = Duration.between(Instant.now(), ZonedDateTime.parse("2016-07-27T07:00:00+01[Europe/Stockholm]"));
    }
}
