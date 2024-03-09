package JavaNotesForProfessionals.cap_10_PrimitiveDataTypes;

public class BytePrimitive {
    public static void main(String[] args) {
        byte example = -36;
        byte myByte = 96;
        byte anotherByte = 7;

        byte addedBytes = (byte) (myByte + anotherByte);    // 103
        byte subtractedBytes = (byte) (myByte + anotherByte);    // 89

        byte high = Byte.MAX_VALUE;           // high == 127
        byte low  = Byte.MIN_VALUE;           // low == -128

        byte defaultByte;
    }
}
