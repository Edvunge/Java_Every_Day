package books.JavaNotesForProfessionals.chapter2_TypeConversion;

import java.util.Calendar;

public class Testing_If {
    public static void main(String[] args) {
        Object obj = Calendar.getInstance();
        long time = 0;

        if (obj instanceof Calendar) {
            //time = ((Calendar)obj).getTime();
        }
    }
}
