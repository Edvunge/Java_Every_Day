package JavaNotesForProfessionals.cap_27_ListVSset;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class List_vs_Set {
    public static void main(String[] args) {
        System.out.println("List Example ......");
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");
        for (Object temp : list) {
            System.out.println(temp);
        }

        System.out.println("Set Example ........");
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("1");
        set.add("2");
        set.add("5");

        for (String temp : set) {
            System.out.println(temp);
        }
    }
}
