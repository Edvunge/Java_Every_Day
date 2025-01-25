package books.JavaNotesForProfessionals.chapter19_BigDecimal.section19MathematicalOperations_with_BigDecimal;

import java.math.BigDecimal;

public class Multiplication_With_BigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5.11");
        BigDecimal b = new BigDecimal("7.221");

        //Equivalent to result = a * b
        BigDecimal result = a.multiply(b);
        System.out.println(result);
    }
}
