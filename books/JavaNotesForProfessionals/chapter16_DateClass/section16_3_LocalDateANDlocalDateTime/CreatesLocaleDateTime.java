package books.JavaNotesForProfessionals.chapter16_DateClass.section16_3_LocalDateANDlocalDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class CreatesLocaleDateTime {
    public static void main(String[] args) {
        // Create default date time
        LocalDateTime lDateTime = LocalDateTime.now();

        // creates date time from values
        lDateTime = LocalDateTime.parse("2017-12-05T11:38:30");

        // create date time from zone
        LocalDateTime.now(ZoneId.systemDefault());
        System.out.println(lDateTime);

        //
        //
    }
}
