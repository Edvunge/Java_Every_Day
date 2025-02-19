package books.Thinking_in_java.chapter7_Cleanup_and_initialization.initialization;

class Banana {
    void peel(int i){/* ... */}
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
