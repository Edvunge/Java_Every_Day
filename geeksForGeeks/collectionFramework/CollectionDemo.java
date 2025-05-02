package geeksForGeeks.collectionFramework;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();


        // Adding the elements into the
        // Hashtable
        v.addElement(1);
        v.addElement(2);

        // Adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}
