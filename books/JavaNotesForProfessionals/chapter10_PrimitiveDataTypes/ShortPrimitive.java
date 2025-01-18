package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

import java.sql.SQLOutput;

public class ShortPrimitive {
    public static void main(String[] args) {
        short example = -48;
        short myShort = 987;
        short anotherShort = 17;
        System.out.println("example: " + example);
        System.out.println("myShort: " + myShort);
        System.out.println("anotherShort: " + anotherShort);

        short addedShorts = (short) (myShort + anotherShort);
        short subtractedShorts = (short) (myShort - anotherShort);
        System.out.println("addedShorts: " + addedShorts);
        System.out.println("subtractedShorts: " + subtractedShorts);

        short high = Short.MAX_VALUE;
        short low = Short.MIN_VALUE;
        System.out.println("high: " + high);
        System.out.println("low: " + low);
    }
}
