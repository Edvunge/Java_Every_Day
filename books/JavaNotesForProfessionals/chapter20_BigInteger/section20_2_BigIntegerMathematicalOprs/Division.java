package books.JavaNotesForProfessionals.chapter20_BigInteger.section20_2_BigIntegerMathematicalOprs;

import java.math.BigInteger;

public class Division {
    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("10");
        BigInteger value2 = new BigInteger("5");

        BigInteger div = value1.divide(value2);
        System.out.println(div);
    }
}
