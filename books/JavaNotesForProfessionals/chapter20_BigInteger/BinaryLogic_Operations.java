package books.JavaNotesForProfessionals.chapter20_BigInteger;

import JavaProgrammingMasterclass.section_3_FirstSteps.StartingOutExpressions;

import java.math.BigInteger;

public class BinaryLogic_Operations {
    public static void main(String[] args) {

        System.out.println("BINARY LOGIC OPERATIONS: ");
        System.out.println();

        // Binary Or
        BigInteger val1 = new BigInteger("10");
        BigInteger val2 = new BigInteger("10");

        System.out.println("BINARY OR: " + val1.or(val2));

        // Binary And
        BigInteger val3 = new BigInteger("10");
        BigInteger val4 = new BigInteger("9");

        System.out.println("BINARY AND: " + val3.and(val4));

        // Binary Xor
        BigInteger val5 = new BigInteger("10");
        BigInteger val6 = new BigInteger("9");

        System.out.println("BINARY XOR: " + val5.xor(val6));

        // RighShift
        BigInteger val7 = new BigInteger("10");

        System.out.println("RIGH SHIFT: " + val7.shiftRight(1));

        // LeftShift
        BigInteger val8 = new BigInteger("10");

        System.out.println("LEFT SHIFT: " + val7.shiftLeft(1));


        // Binary Inversion(Not)
        BigInteger val9 = new BigInteger("10");

        System.out.println("BINARY INVERSION: " + val9.not());


        // NAND (And-Not)
        BigInteger val10 = new BigInteger("10");
        BigInteger val11 = new BigInteger("9");

        System.out.println("NAND: " + val10.andNot(val11));
    }
}
