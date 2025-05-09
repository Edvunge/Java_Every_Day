package ESTUDOS.collections.study.javaArrayList.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort_with_comparator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);
    }
}
