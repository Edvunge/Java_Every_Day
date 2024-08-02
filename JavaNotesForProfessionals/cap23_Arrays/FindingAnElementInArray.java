package JavaNotesForProfessionals.cap23_Arrays;

import java.util.Arrays;

public class FindingAnElementInArray {
    public static void main(String[] args) {
        String[] strings = new String[] {"A", "B" ,"C"};
        int[] ints = new int[] {1, 2, 3, 4};

        // Using Arrays.binarySearch(for sorted arrays only)
        int index = Arrays.binarySearch(strings, "A");
        int index2 = Arrays.binarySearch(ints, 1);

        // Using a Arrays.asList(for non-primitive arrays only)
        int index3 = Arrays.asList(strings).indexOf("A");
        int index4 = Arrays.asList(ints).indexOf(1);

        // Using a Arrays.asList(for non-primitive arrays only)
        int index5 = Arrays.asList(strings).indexOf("A");
        int index6 = Arrays.asList(ints).indexOf(1);

        // Using a Stream
        //int index7 = IntStream.range(0, strings.length).filter(i -> )
    }
}
