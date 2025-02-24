package books.JavaNotesForProfessionals.chapter20_BigInteger;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        // to convert a numeric String to BigInteger
        String decimalString = "-1";
        BigInteger valueFromDecimalString = new BigInteger(decimalString);

        String binaryString = "10";
        int binaryRadix = 2;
        BigInteger valueFromBinaryString = new BigInteger(binaryString, binaryRadix);

        //byte[] bytes = new byte[] {(byte) 0x00}
        //BigInteger
    }
}
