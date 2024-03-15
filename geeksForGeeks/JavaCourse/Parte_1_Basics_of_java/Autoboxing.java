package geeksForGeeks.JavaCourse.Parte_1_Basics_of_java;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        char ch = 'a';

        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(25);

        System.out.println(arrayList.get(0));
    }
}
