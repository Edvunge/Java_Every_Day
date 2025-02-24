package books.JavaNotesForProfessionals.chapter20_BigInteger.section20_2_BigIntegerMathematicalOprs;

import java.math.BigInteger;

public class Gcd {
    public static void main(String[] args) {
        BigInteger value1 = new BigInteger("12");
        BigInteger value2 = new BigInteger("18");

        System.out.println(value1.gcd(value2));
    }
}
