package JavaNotesForProfessionals.cap23_Arrays;

import java.util.Arrays;

public class ComparingForEquality {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {1, 2, 3};
        System.out.println(a.equals(b));
        System.out.println(Arrays.equals(a, b));


        int y[] = { 1, 2, 3 };
        int x[] = { 1, 2, 3 };

        Object[] yObject = { y };
        Object[] xObject = { x };

        System.out.println(Arrays.equals(yObject, xObject));
        System.out.println(Arrays.deepEquals(yObject, xObject));
    }
}
