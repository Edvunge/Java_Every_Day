package books.JavaNotesForProfessionals.chapter19_BigDecimal;

import java.math.BigDecimal;

public class ComparingBigDecimals {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5);
        System.out.println(a.compareTo(new BigDecimal(0)));
        a.compareTo(new BigDecimal(5));
        a.compareTo(new BigDecimal(10));
    }
}
