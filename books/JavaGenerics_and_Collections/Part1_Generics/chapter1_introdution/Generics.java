package books.JavaGenerics_and_Collections.Part1_Generics.chapter1_introdution;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("Wold! ");
        String s = words.get(0)+words.get(1);
        assert s.equals("Hello World!");
    }
}
