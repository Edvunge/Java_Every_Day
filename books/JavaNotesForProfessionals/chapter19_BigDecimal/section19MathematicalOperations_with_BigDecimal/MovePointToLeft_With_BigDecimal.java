package books.JavaNotesForProfessionals.chapter19_BigDecimal.section19MathematicalOperations_with_BigDecimal;

import java.math.BigDecimal;

public class MovePointToLeft_With_BigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5234.49843776");

        BigDecimal result = a.movePointLeft(2);
        System.out.println(result);
    }
}
