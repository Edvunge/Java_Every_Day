package books.JavaNotesForProfessionals.chapter16_DateClass.section16_8_CreatingDateObjects;

import java.util.Calendar;
import java.util.Date;

public class Calenndar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(90, Calendar.DECEMBER, 11);
        Date myBirthDate = calendar.getTime();
        System.out.println(myBirthDate);
    }
}
