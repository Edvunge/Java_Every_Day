package JavaNotesForProfessionals.cap_20_BigInteger;

import java.math.BigInteger;

public class InicializationBigInteger {
    public static void main(String[] args) {
        long longValue = Long.MAX_VALUE;
        BigInteger valueFromLong = BigInteger.valueOf(longValue);

        // or for integers
        int inValue = Integer.MIN_VALUE;
        BigInteger valueFromInt = BigInteger.valueOf(inValue);

        // to convert a numeric string to biginteger use:
        String decimalString = "-1";
        BigInteger valueFromDecimalString = new BigInteger(decimalString);

        String binaryString = "10";
        int binaryRadix = 2;
        BigInteger valueFromBinaryString = new BigInteger(binaryString, binaryRadix);

        byte[] bytes = new byte[] { (byte) 0x00 };
        BigInteger valueFromBytes = new BigInteger(bytes);

        byte[] unsignedBytes = new byte[] { (byte) 0x00 };
        int sign = 1;
        BigInteger valueFromUnsignedBytes = new BigInteger(sign, unsignedBytes);

    }
}
