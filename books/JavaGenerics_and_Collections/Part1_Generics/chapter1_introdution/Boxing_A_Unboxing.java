package books.JavaGenerics_and_Collections.Part1_Generics.chapter1_introdution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boxing_A_Unboxing {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(Integer.valueOf(1));
        int n = ints.get(0).intValue();

        List<Integer> smalls = Arrays.asList(1,2,3);
        assert sumInteger(smalls) == sum(smalls);
        assert sumInteger(smalls) == sumInteger(smalls);
    }

    public static int sum(List<Integer> ints) {
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        return s;
    }


    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {
            s += n;
        }
        return s;
    }
}
