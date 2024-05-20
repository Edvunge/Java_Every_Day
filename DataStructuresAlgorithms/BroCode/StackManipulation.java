package DataStructuresAlgorithms.BroCode;

import java.util.Stack;

public class StackManipulation {
    public static void main(String[] args) {
        // STACK = LIFO data structure. Last-in First-Out
        //          stores objects into a sort of "vertical tower"
        //          push() to add to the top
        //          pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //stack.pop();
        //stack.pop();

        //System.out.println(stack.peek());
        //System.out.println(stack.search("DOOM"));

        System.out.println(stack);
    }
}
