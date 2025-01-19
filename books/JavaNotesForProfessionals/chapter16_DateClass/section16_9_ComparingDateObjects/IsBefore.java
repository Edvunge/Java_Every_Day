package books.JavaNotesForProfessionals.chapter16_DateClass.section16_9_ComparingDateObjects;

import java.time.LocalDate;

public class IsBefore {
    public static void main(String[] args) {
        final LocalDate now = LocalDate.now();
        final LocalDate birthdate2 = LocalDate.of(2012, 6, 30);
        final LocalDate birthdate3 = LocalDate.of(2014, 8, 28);


        // isBefore example
        System.out.printf("Is %1$tF before %2$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(now.isBefore(birthdate2)));
        System.out.printf("Is %1$tF before %1$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(now.isBefore(now)));
        System.out.printf("Is %2$tF before %1$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(birthdate2.isBefore(now)));


        //isAfter example
        System.out.printf("Is %1$tF after %2$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(now.isAfter(birthdate2)));
        System.out.printf("Is %1$tF after %1$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(now.isAfter(now)));
        System.out.printf("Is %2$tF after %1$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(birthdate2.isAfter(now)));


        //compareTo example
        System.out.printf("Compare %1$tF to %2$tF %3$d%n", now, birthdate2,
                Integer.valueOf(now.compareTo(birthdate2)));

        System.out.printf("Compare %1$tF to %1$tF %3$d%n", now, birthdate2,
                Integer.valueOf(now.compareTo(now)));
        System.out.printf("Compare %2$tF to %1$tF %3$d%n", now, birthdate2,
                Integer.valueOf(birthdate2.compareTo(now)));


        //equals example
        System.out.printf("Is %1$tF equal to %2$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(now.equals(birthdate2)));
        System.out.printf("Is %1$tF to %2$tF? %3$b%n", birthdate2, birthdate3,
                Boolean.valueOf(birthdate2.equals(birthdate3)));


        //isEqual example
        System.out.printf("Is %1$tF equal to %2$tF? %3$b%n", now, birthdate2,
                Boolean.valueOf(now.isEqual(birthdate2)));
        System.out.printf("Is %1$tF to %2$tF? %3$b%n", birthdate2, birthdate3,
                Boolean.valueOf(birthdate2.isEqual(birthdate3)));
    }
}
