package JavaNotesForProfessionals.cap_17_DaTeANDtime;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.now;

public class OperationsOnDatesTimes {
    public static void main(String[] args) {
        LocalDate tomorrow = now().plusDays(1);
        LocalDateTime anHourFromNow = LocalDateTime.now().plusHours(1);
        Long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusDays(3));
        Duration duration = Duration.between(Instant.now(), ZonedDateTime.parse("2016-07-27T07:00:00+01:00[Europe/Stockholm]"));
    }
}
