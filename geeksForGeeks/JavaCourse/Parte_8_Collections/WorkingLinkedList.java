package geeksForGeeks.JavaCourse.Parte_8_Collections;

import java.util.LinkedList;

public class WorkingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);

        System.out.println(ll);

        ll.remove(3);

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
