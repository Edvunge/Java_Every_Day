package books.JavaNotesForProfessionals.chapter16_DateClass.section16_4_CreatingSpecificDate;

import java.util.Calendar;
import java.util.Date;

public class PitFall {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(1974, 6, 2, 8, 0, 0);
        Date d = c.getTime();

        System.out.println(c);
    }
}
