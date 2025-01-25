package books.JavaNotesForProfessionals.chapter19_BigDecimal.section19MathematicalOperations_with_BigDecimal;

import java.math.BigDecimal;

public class Division_With_BigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("7");

        //Equivalent to result = a / b
        BigDecimal result = a.divide(b);
        System.out.println(result);
    }
}
