package books.JavaNotesForProfessionals.chapter17_Dates_and_Time.section17_5_variousClassesDateTimeAPI;

import java.time.*;

public class SomeMethodExamples {
    /**
     * Has the methods of the class {@link java.time.LocalDateTimeDT}
     */

    public static void checkLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date time using static now() method :::: >>> "
        + localDateTime);

        LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("AET")));
        System.out.println("LOCAL TIME USING now(ZoneId ZoneId) method :::: >>>>>" + ldt1);

        LocalDateTime ldt2 = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
        System.out.println("LOCAL TIME USING now(ZoneId ZoneId) method :::: >>>>>" + ldt2);

        System.out.println("Following is a static map in ZoneId class which has mapping of short timezone names to their Actual timeZone names");
        System.out.println(ZoneId.SHORT_IDS);
    }

    /**
     * This has the methods of class {@link java.time.LocalDate}
     */
    public static void checkLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Gives date without Time using now() method. >> " +
                localDate);

        LocalDate localDate2 = LocalDate.now(ZoneId.of(ZoneId.SHORT_IDS.get("ECT")));
        System.out.println("now() is overridden to take ZoneID as parametere using this we can get the same date under different timezones. >> " + localDate2);
    }

    /**
     * This has methods of abstract class {@link Clock}. Clock can be used
     * for time wich has time with {@link java.util.TimeZone}.
     */
    public static void checkClock() {
        Clock clock = Clock.systemUTC();
        // Represents time according to ISO 8601
        System.out.println("Time using Clock class : " + clock.instant());
    }

    /**
     * This has the {@link java.time.Instant} class methods.
     */
    public static void checkInstant() {
        Instant instant = Instant.now();

        System.out.println("Instant using now() method :: " + instant);

        Instant ins1 = Instant.now(Clock.systemUTC());

        System.out.println("Instants using now(Clock clock) :: " + ins1);
    }

    /**
     * This class checks the methods of the {@link Duration} class.
     */
    public static void checkDuration() {
        System.out.println(Duration.ofDays(2));
    }

    /**
     * Shows Local time without date. It doesn't store or represenet a date and
     * time. Instead its a representation of Time like clock on the wall.
     */
    public static void checkLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime :: " + localTime);
    }

    /**
     * A date time wich Time zone details in ISO-8601 standards.
     */
    public static void checkZonedDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("CST")));
        System.out.println(zonedDateTime);
    }
}
