package books.JavaGenerics_and_Collections.Part1_Generics.chapter2_SubtypingAndWildcards;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<Number>();
        nums.add(2);
        nums.add(3.14);
        assert nums.toString().equals("[2, 3.14]");
    }
}
