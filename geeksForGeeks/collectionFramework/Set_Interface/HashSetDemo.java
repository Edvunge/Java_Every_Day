package geeksForGeeks.collectionFramework.Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very Helpful");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
