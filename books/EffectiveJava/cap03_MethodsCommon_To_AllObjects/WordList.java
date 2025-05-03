package books.EffectiveJava.cap03_MethodsCommon_To_AllObjects;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
