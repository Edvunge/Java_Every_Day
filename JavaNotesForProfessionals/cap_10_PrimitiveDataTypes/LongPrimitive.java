package JavaNotesForProfessionals.cap_10_PrimitiveDataTypes;

import java.util.Objects;

public class LongPrimitive {
    public static void main(String[] args) {
        long example = -42;
        long myLong = 284;
        long anotherLong = 73;

        //an "L" must be appended to the end of the number, because by default,
        //numbers are assumed to be the int type. Appending an "L" makes it a long
        //as 549755813888 (2 ^ 39) is larger than the maximum value of an int (2^31 - 1),
        //"L" must be appended

        long bigNumber = 549755813888L;
        long addedLongs = myLong + anotherLong; // 284 + 73 = 357
        long subtractedLongs = myLong - anotherLong; // 284 - 73 = 211

        // The maximum and minimum values of long can be found at:
        long high = Long.MAX_VALUE; // high == 9223372036854775807L
        long low = Long.MIN_VALUE; // low == -9223372036854775808L

        // The default value of a long is 0L
        long defaultLong; // defaultLong == 0L

        Long val1 = 127L;
        Long val2 = 127L;
        System.out.println(val1 == val2); // true

        Long val3 = 128L;
        Long val4 = 128L;
        System.out.println(Objects.equals(val3, val4)); // true

    }
}
