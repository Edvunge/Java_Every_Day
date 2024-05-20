package DataStructuresAlgorithms.GeeksForGeeks.Stack;

public class StackImplementationUsingArray {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // max size of stack

    boolean isEmpty() {
        return (top < 0);
    }
    StackImplementationUsingArray(){
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Sctack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack undeflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
}














