package JavaNotesForProfessionals.cap26_Sets;

import java.util.*;

public class EliminatingDuplcatesUsingSet {
    public static void main(String[] args) {
        // eliminating duplicates using set
        List<String> names = new ArrayList<>(
                Arrays.asList("john", "Marco", "Jenny", "Emily", "Jenny", "Emily", "John"));
        Set<String> noDuplicates = new HashSet<>(names);
        System.out.println("noDuplicates = " + noDuplicates);
    }
}
