package geeksForGeeks.JavaCourse.Parte_8_Collections;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionsDemo {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();

        // adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);

        // adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");

        // Accessing the first element of the
        // array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}
