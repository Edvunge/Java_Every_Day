package geeksForGeeks.JavaCourse.Parte_8_Collections;

import java.util.PriorityQueue;

public class WorkingQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.peek());
    }
}
