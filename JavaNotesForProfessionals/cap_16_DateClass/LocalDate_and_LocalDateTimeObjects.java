package JavaNotesForProfessionals.cap_16_DateClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDate_and_LocalDateTimeObjects {
    public static void main(String[] args) {
        // Creates a LocalDate
        LocalDate lDate = LocalDate.now();

        // Create a date from values
        lDate = LocalDate.of(2017, 12, 15);

        // create date from string
        lDate = LocalDate.parse("2017-12-15");

        // creates date from zone
        LocalDate.now(ZoneId.systemDefault());


        // CREATE A LOCALDATIME

        // create a default date time
        LocalDateTime lDateTime = LocalDateTime.now();

        // create a date time from time
        lDateTime = LocalDateTime.of(2017, 12, 15, 11, 30);

        // create a date time from string
        lDateTime = LocalDateTime.parse("2017-12-05T11:30:30");

        // create a date time from zone
        LocalDateTime.now(ZoneId.systemDefault());



        // LocalDate to Date and vice-versa

    }
}
