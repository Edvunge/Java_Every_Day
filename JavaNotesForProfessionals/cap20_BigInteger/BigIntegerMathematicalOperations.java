package JavaNotesForProfessionals.cap20_BigInteger;

import java.math.BigInteger;

public class BigIntegerMathematicalOperations {
    public static void main(String[] args) {
        // Addition: 10 + 10 = 20
        BigInteger value1 = new BigInteger("10");
        BigInteger value2 = new BigInteger("10");

        BigInteger sum = value1.add(value2);
        System.out.println(sum);

        // subtraction: 10-9 = 1
        BigInteger value3 = new BigInteger("10");
        BigInteger value4 = new BigInteger("9");

        BigInteger sub = value3.subtract(value4);
        System.out.println(sub);
    }
}
