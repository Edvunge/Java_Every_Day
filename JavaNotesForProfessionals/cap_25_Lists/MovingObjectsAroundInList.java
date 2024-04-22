package JavaNotesForProfessionals.cap_25_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MovingObjectsAroundInList {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add(" how");
        ls.add(" are");
        ls.add(" you?");
        ls.add("hello,");
        Collections.rotate(ls, 1);

        for(String line : ls) System.out.print(line);
        System.out.println();

        Random random = new Random(12);
        Collections.shuffle(ls, random);
    }
}
