package books.JavaNotesForProfessionals.chapter16_DateClass.section16_10_ConvertingStringDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class convertingStringDate {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        String dateStr = "02/25/2016";
        Date date = dateFormat.parse(dateStr);
        System.out.println(date.getYear());
    }
}
