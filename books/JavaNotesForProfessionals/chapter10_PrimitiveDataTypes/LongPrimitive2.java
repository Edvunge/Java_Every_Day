package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

import java.util.Objects;

public class LongPrimitive2 {
    public static void main(String[] args) {
        Long val1 = 127L;
        Long val2 = 127L;
        System.out.println(val1 == val2);

        Long val3 = 128L;
        Long val4 = 128L;
        System.out.println(val3 == val4);

        System.out.println(Objects.equals(val3, val4));
    }
}
