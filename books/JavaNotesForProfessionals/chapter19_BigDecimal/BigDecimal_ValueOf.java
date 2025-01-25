package books.JavaNotesForProfessionals.chapter19_BigDecimal;

import java.math.BigDecimal;

public class BigDecimal_ValueOf {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(10L);
        BigDecimal b = new BigDecimal(10L);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
