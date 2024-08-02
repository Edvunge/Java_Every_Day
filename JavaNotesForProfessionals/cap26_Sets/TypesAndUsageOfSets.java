package JavaNotesForProfessionals.cap26_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesAndUsageOfSets {
    public static void main(String[] args) {
        // HasheSet - Random Sorting
        Set<String> set = new HashSet<>();
        set.add("Banana");
        set.add("Banana");
        set.add("Apple");
        set.add("Strawberry");


        // LinkedHashSet - Insertion Order
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Banana");
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Strawberry");

        Set<String> set3 = new TreeSet<>();
        set3.add("Banana");
        set3.add("Banana");
        set3.add("Apple");
        set3.add("Strawberry");

        Set<String> set4 = new TreeSet<>( (string1, string2) -> string2.compareTo(string1));
        set.add("Banana");
        set.add("Banana");
        set.add("Apple");
        set.add("Strawberry");
     }
}
