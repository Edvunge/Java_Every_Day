package geeksForGeeks.collectionFramework.Set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very Helpful");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
