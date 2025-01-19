package books.JavaNotesForProfessionals.chapter16_DateClass.section16_5_ConvertingDate_To_CertainString;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplyPattern {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");

        dateFormat.applyPattern("dd-MM-yyyy");
        System.out.println(dateFormat.format(today));

        dateFormat.applyPattern("dd-MM-yyyy HH:mm:ss E");
        System.out.println(dateFormat.format(today));
    }
}
