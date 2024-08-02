package JavaNotesForProfessionals.cap25_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingCommomElementsBetween2lists {
    public static void main(String[] args) {
        List<Integer> numbersA = new ArrayList<>();
        List<Integer> numbersB = new ArrayList<>();
        numbersA.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 7, 5, 2} ));
        numbersB.addAll(Arrays.asList(new Integer[] { 13, 32, 444, 3, 57, 21} ));

        System.out.println("A: " + numbersA);
        System.out.println("B: " + numbersB);

        List<Integer> numbersC = new ArrayList<>();
        numbersC.addAll(numbersA);
        numbersC.retainAll(numbersB);

        System.out.println("List A: " + numbersA);
        System.out.println("List B: " + numbersB);
        System.out.println("Common elements between A and B: " + numbersC);
    }
}
