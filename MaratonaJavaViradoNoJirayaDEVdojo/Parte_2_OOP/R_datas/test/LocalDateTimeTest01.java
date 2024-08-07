package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.R_datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalDate time = LocalDate.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(LocalTime.from(time));

        System.out.println(date);
        System.out.println(date);
    }
}
