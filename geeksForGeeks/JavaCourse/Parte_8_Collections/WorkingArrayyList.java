package geeksForGeeks.JavaCourse.Parte_8_Collections;

import java.util.ArrayList;

public class WorkingArrayyList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appeding new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);

        System.out.println(al);
        al.remove(3);


        System.out.println(al);

        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i) + " ");
    }
}
