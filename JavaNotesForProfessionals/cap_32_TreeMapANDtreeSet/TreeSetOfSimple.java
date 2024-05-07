package JavaNotesForProfessionals.cap_32_TreeMapANDtreeSet;

import java.util.TreeSet;

public class TreeSetOfSimple {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(12);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.size());
        System.out.println(treeSet.contains(12));
        System.out.println(treeSet.contains(15));

        for (Integer i : treeSet) {
            System.out.println(i + " ");
        }
    }
}
