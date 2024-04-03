package JavaNotesForProfessionals.cap_23_Arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] a = { 4, 1, 3, 2 };
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        int[] y = {4, 1, 3, 2};
        int[] x = Arrays.copyOf(a, a.length);

        Double[] doubles = { 1.0, 2.0, 3.0 };
        Number[] numbers = Arrays.copyOf(doubles, doubles.length, Number[].class);

        int[] a1 = { 4, 1, 3, 2 };
        int[] b1 = new int[a1.length];
        System.arraycopy(a1, 0, b1, 0, a1.length);
    }
}
