package JavaNotesForProfessionals.cap17_DaTeANDtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DateTimeFormat {
    public static void main(String[] args) {
        String pattern = "dd-MM-yyyy HH:mm";
        DateTimeFormatter dtF1 = ofPattern(pattern);
        LocalDateTime ldp1 = LocalDateTime.parse("2014-03-25T01:30"),
                      ldp2 = LocalDateTime.parse("15-05-2016  13:55",dtF1);

        System.out.println(ldp1 + "\n" + ldp2);

        DateTimeFormatter dtF2 = ofPattern("EEE d, MMMM, yyyy  HH:mm");

        DateTimeFormatter dtF3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        LocalDateTime ldtf1 = LocalDateTime.now();

        System.out.println(ldtf1.format(dtF2) + "\n" +ldtf1.format(dtF3));
    }
}
