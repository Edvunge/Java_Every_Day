package ESTUDOS.collections.study.javaArrayList.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_In_Natural_Order {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(15);
        numbers.add(1);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
