package JavaNotesForProfessionals.cap24_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratingOverCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("clementine", "Duran", "Mike"));

        names.forEach(System.out::println);

        names.parallelStream().forEach(System.out::println);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
