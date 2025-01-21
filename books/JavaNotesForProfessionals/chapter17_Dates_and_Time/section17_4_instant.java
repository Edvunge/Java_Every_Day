package books.JavaNotesForProfessionals.chapter17_Dates_and_Time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class section17_4_instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant epoch1 = Instant.ofEpochMilli(0);
        Instant epoch2 = Instant.parse("1970-01-01T00:00:00Z");
        ChronoUnit.MICROS.between(epoch1, epoch2); // 0
    }
}
