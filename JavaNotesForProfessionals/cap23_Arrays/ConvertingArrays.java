package JavaNotesForProfessionals.cap23_Arrays;

import java.util.Arrays;

public class ConvertingArrays {
    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3, 4};
        Integer[] boxedArray = Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
    }
}
