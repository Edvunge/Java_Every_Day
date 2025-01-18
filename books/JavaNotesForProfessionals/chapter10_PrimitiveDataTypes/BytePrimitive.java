package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

import java.sql.SQLOutput;

public class BytePrimitive {
    public static void main(String[] args) {
        byte example = -36;
        byte myByte = 96;
        byte anotherByte = 7;
        System.out.println("example: " + example);
        System.out.println("myByte: " + myByte);
        System.out.println("anotherByte: " + anotherByte);

        byte addedBytes = (byte) (myByte + anotherByte);
        byte subtractedBytes = (byte) (myByte - anotherByte);
        System.out.println("addedBytes: " + addedBytes);
        System.out.println("subtractedBytes: " + subtractedBytes);

        byte high = Byte.MAX_VALUE;
        byte low = Byte.MIN_VALUE;
        System.out.println("high: " + high);
        System.out.println("low: " + low);
    }
}
