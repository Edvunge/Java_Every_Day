package JavaNotesForProfessionals.cap32_TreeMapANDtreeSet;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSimple {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(10, "ten");
        treeMap.put(4, "four");
        treeMap.put(1, "one");
        treeMap.put(12, "twelve");

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.size());
        System.out.println(treeMap.get(12));
        System.out.println(treeMap.get(15));

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry + " ");
        }
    }
}
