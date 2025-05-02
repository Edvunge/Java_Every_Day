package geeksForGeeks.collectionFramework.List_Interface;

import java.util.Iterator;
import java.util.Stack;

public class Main_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");


        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
