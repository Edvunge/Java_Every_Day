package JavaNotesForProfessionals.cap10_PrimitiveDataTypes;

public class ShortPrimitive {
    public static void main(String[] args) {
        short example = -48;
        short myShort = 987;
        short anotherShort = 17;

        short addedShorts = (short) (myShort + anotherShort);         // 1.004
        short subtractedShorts = (short) (myShort + anotherShort);    // 970

        short high = Short.MAX_VALUE;                                 // high == 32767
        short low  = Short.MIN_VALUE;                                 // low  == -32768

        short defaultShort;
    }
}
