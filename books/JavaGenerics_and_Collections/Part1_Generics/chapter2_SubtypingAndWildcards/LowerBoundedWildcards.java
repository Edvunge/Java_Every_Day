package books.JavaGenerics_and_Collections.Part1_Generics.chapter2_SubtypingAndWildcards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        printOlnyIntegerClassorSuperClass(list1);

        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        printOlnyIntegerClassorSuperClass(list2);
    }

    public static void printOlnyIntegerClassorSuperClass(
            List<? super Integer> list) {
        System.out.println(list);
    }
}
