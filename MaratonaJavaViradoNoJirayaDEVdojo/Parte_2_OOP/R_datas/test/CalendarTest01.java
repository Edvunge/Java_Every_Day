package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.R_datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo e o primeiro dia da semana");
        }

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 10);
        Date date = c.getTime();
        System.out.println(date);
    }
}
