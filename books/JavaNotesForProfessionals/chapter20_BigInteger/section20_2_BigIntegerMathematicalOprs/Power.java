package books.JavaNotesForProfessionals.chapter20_BigInteger.section20_2_BigIntegerMathematicalOprs;

import java.math.BigInteger;

public class Power {
    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("10");
        BigInteger power = value1.pow(3);
        System.out.println(power);
    }
}
