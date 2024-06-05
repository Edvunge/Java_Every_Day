package geeksForGeeks.JavaCourse.Parte_8_Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        hm.put(4, "Is");
        hm.put(5, "Very Helpful");

        System.out.println("Value for 1 is " + hm.get(1));

        for (Map.Entry<Integer, String> e : hm.entrySet() ) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
