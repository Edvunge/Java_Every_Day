package JavaNotesForProfessionals.cap_20_BigInteger;

import java.math.BigInteger;

public class BinaryLogicOperationsBigInteger {
    public static void main(String[] args) {
        BigInteger val1 = new BigInteger("10");
        BigInteger val2 = new BigInteger("9");

        // Binary Or:
        val1.or(val2);

        // Binary And:
        val1.and(val2);

        // Binary Xor:
        val1.xor(val2);

        //RightShift:
        val1.shiftRight(1);

        // LeftShift:
        val1.shiftLeft(1);

        // Binary Inversion (Not):
        val1.not();

        // NAND(And-Not):*
        val1.andNot(val2);
    }
}
