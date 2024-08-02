package JavaNotesForProfessionals.cap26_Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateListFromAnExistingSet {
    public static void main(String[] args) {
        // create a list from an existing set
        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("boo");

        List<String> list = new ArrayList<>();
        list.addAll(set);
    }
}
