package JavaNotesForProfessionals.cap_28_Maps;

import java.util.Iterator;
import java.util.Map;

public class IteratingMapEntriesEfficiently {
    public static void main(String[] args) {
        // 1. implementation using Iterator with Map.Entry
        //Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();

        //2. implementation using Map.forEach(java 8+)
        //for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
        //    sum += pair.getKey() + pair.getValue();
        //}
    }
}
