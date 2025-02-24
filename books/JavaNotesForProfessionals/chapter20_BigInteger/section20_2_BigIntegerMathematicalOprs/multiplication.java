package books.JavaNotesForProfessionals.chapter20_BigInteger.section20_2_BigIntegerMathematicalOprs;

import java.math.BigInteger;

public class multiplication {
    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("10");
        BigInteger value2 = new BigInteger("5");

        BigInteger mul = value1.multiply(value2);
        System.out.println(mul);
    }
}
