package books.JavaNotesForProfessionals.chapter19_BigDecimal.section19MathematicalOperations_with_BigDecimal;

import java.math.BigDecimal;

public class Power_With_BigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5");

        //Equivalent to result = a^10
        BigDecimal result = a.pow(10);
        System.out.println(result);
    }
}
