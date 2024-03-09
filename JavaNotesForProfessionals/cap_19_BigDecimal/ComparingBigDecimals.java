package JavaNotesForProfessionals.cap_19_BigDecimal;

import java.math.BigDecimal;

public class ComparingBigDecimals {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5);
        a.compareTo(new BigDecimal(0));
        System.out.println(a);

        a.compareTo(new BigDecimal(5));
        System.out.println(a);

        a.compareTo(new BigDecimal(10));
        System.out.println(a);
    }
}
