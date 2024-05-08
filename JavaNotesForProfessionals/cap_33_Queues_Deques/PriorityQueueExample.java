package JavaNotesForProfessionals.cap_33_Queues_Deques;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.addAll(Arrays.asList(9, 2, 3, 1, 3, 8));

        System.out.println( queue );
        queue.remove();

        System.out.println( queue );
        queue.remove();

        System.out.println( queue );
        queue.remove();

        System.out.println( queue );
        queue.remove();

        System.out.println( queue );
        queue.remove();

        System.out.println( queue );
        queue.remove();

        System.out.println( queue );
    }
}
