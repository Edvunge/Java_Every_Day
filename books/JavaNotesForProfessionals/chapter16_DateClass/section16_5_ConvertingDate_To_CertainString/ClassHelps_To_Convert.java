package books.JavaNotesForProfessionals.chapter16_DateClass.section16_5_ConvertingDate_To_CertainString;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassHelps_To_Convert {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        System.out.println(dateFormat.format(today));
    }
}
