package books.JavaNotesForProfessionals.chapter19_BigDecimal.section19MathematicalOperations_with_BigDecimal;

import java.math.BigDecimal;

public class Min_With_BigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("7");

        //Equivalent to result = Min(a, b)
        BigDecimal result = a.min(b);
        System.out.println(result);
    }
}
