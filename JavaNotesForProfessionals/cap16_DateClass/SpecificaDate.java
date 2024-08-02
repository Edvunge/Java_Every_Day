package JavaNotesForProfessionals.cap16_DateClass;

import java.util.Calendar;
import java.util.Date;

public class SpecificaDate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(1974, 6, 2, 8, 0, 0);
        Date d = c.getTime();
    }
}
