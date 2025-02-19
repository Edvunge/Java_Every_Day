package books.Thinking_in_java.chapter7_Cleanup_and_initialization.initialization.method_overloading;

import static java.io.IO.print;

public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        print("int: " + i + ", String: "+ s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
