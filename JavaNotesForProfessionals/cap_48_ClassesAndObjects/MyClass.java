package JavaNotesForProfessionals.cap_48_ClassesAndObjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyClass {
    public static final Set<String> WORDS;

    static {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("foo");
        set.add("bar");
        set.add("42");
        WORDS = Collections.unmodifiableSet(set);
    }
}
