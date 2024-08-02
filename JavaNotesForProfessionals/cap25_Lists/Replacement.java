package JavaNotesForProfessionals.cap25_Lists;

import java.util.ArrayList;
import java.util.List;

public class Replacement {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Program starting!");
        strings.add("Hello World!");
        strings.add("Goodbye World!");

        strings.set(1, "Hi world");

        int pos = strings.indexOf("Goodbye World!");
        if (pos >= 0) {
            strings.set(pos, "Goodbye cruel world!");
        }
    }
}
