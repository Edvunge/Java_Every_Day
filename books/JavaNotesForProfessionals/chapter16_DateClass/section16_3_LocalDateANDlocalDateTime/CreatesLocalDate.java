package books.JavaNotesForProfessionals.chapter16_DateClass.section16_3_LocalDateANDlocalDateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class CreatesLocalDate {
    public static void main(String[] args) {
        // Create a default date
        LocalDate lDate = LocalDate.now();

        // Creates a date from values
        lDate = LocalDate.of(2017, 12, 15);

        // Creates a date from string
        lDate = LocalDate.parse("2017-12-15");

        // Creates a date from zone
        LocalDate.now(ZoneId.systemDefault());

    }
}
