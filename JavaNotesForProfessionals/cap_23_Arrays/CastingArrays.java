package JavaNotesForProfessionals.cap_23_Arrays;

import java.util.Arrays;

public class CastingArrays {
    public static void main(String[] args) {
        Double[] doubles = { 1.0, 2.0, 3.0 };
        Number[] numbers = Arrays.copyOf(doubles, doubles.length, Number[].class);
    }
}
