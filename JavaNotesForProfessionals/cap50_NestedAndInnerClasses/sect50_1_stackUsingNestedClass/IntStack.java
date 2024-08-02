package JavaNotesForProfessionals.cap50_NestedAndInnerClasses.sect50_1_stackUsingNestedClass;

public class IntStack {

    private IntStackNode head;

    private static class IntStackNode {

        private int val;
        private IntStackNode next;

        private IntStackNode(int v, IntStackNode n) {
            val = v;
            next = n;
        }
    }

    public IntStack push(int v) {
        head = new IntStackNode(v, head);
        return this;
    }

    public int pop() {
        int x = head.val;
        head = head.next;
        return x;
    }
}
