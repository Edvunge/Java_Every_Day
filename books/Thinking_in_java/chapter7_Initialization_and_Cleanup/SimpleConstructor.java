package books.Thinking_in_java.chapter7_Initialization_and_Cleanup;

class Rock {
    Rock() {
        System.out.println("Rock...");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
}
