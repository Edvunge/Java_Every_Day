package geeksForGeeks.collectionFramework.Queue_Interface;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(10);
        pQueue.add(15);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.peek());
    }
}
