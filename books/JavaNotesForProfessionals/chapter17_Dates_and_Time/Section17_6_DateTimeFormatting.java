package books.JavaNotesForProfessionals.chapter17_Dates_and_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Section17_6_DateTimeFormatting {
    public static void main(String[] args) {

        //Parsing
        String pattern = "d-MM-yyyy HH:mm";
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern(pattern);

        LocalDateTime ldp1 = LocalDateTime.parse("2014-03-25T01:30"),
                ldp2 = LocalDateTime.parse("15-05-2016 13:55",df1);

        System.out.println(ldp1 + "\n" + ldp2); //Will be printed in Default format

        //Formatting
        DateTimeFormatter dtF2 = DateTimeFormatter.ofPattern("EEE d, MMMM, yyyy HH:mm");

        DateTimeFormatter dtF3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        LocalDateTime ldf1 = LocalDateTime.now();

        System.out.println(ldf1.format(dtF2) + "\n"+ldf1.format(dtF3));
    }
}
