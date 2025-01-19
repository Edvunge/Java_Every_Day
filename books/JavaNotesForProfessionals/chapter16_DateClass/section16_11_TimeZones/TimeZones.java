package books.JavaNotesForProfessionals.chapter16_DateClass.section16_11_TimeZones;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZones {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(TimeZone.getDefault().getDisplayName());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(date));
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/Lisbon"));
        System.out.println(sdf.format(date));
    }
}
