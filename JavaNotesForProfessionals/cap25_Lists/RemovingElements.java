package JavaNotesForProfessionals.cap25_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingElements {
    public static void main(String[] args) {
        List<Integer> numbersA = new ArrayList<>();
        List<Integer> numbersB = new ArrayList<>();

        numbersA.addAll(Arrays.asList(new Integer[] {1, 3, 4, 7, 5, 2}));
        numbersB.addAll(Arrays.asList(new Integer[] {13, 32, 444, 17, 25, 22}));
        System.out.println("A: " + numbersA);
        System.out.println("B: " + numbersB);

        numbersB.retainAll(numbersA);
        System.out.println("B cleared: " + numbersB);
    }
}
