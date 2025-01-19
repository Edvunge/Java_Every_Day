package books.JavaNotesForProfessionals.chapter16_DateClass.section16_1_convertJavaUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UtilToSqlConversion {
    public static void main(String[] args) {
        Date utilDate = new Date();
        System.out.println("java.util.Date is: " + utilDate);
        Date sqlDate = convert(utilDate);

        System.out.println("java.sql.Date is : " + sqlDate);
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        System.out.println("dateFormated date is : " + df.format(utilDate));
    }

    private static Date convert(Date uDate) {
        Date sDate = new Date(uDate.getTime());
        return sDate;
    }
}
