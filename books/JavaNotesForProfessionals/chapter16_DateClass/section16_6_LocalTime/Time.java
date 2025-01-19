package books.JavaNotesForProfessionals.chapter16_DateClass.section16_6_LocalTime;

import java.time.LocalTime;
import java.util.Locale;

public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        time = LocalTime.MIDNIGHT;
        time = LocalTime.NOON;
        time = LocalTime.of(12, 12, 45);

        System.out.println(time);
        System.out.println(" = = = = = = = = = = = = = = = ");

        time.plusMinutes(1);
        time.getMinute();
        time.minusMinutes(1);
    }
}
