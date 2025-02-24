package books.JavaNotesForProfessionals.chapter20_BigInteger.section20_2_BigIntegerMathematicalOprs;

import java.math.BigInteger;

public class Remainder {
    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("10");
        BigInteger value2 = new BigInteger("6");

        BigInteger power = value1.remainder(value2);
        System.out.println(power);
    }
}
