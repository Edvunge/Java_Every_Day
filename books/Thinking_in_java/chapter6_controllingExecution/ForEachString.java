package books.Thinking_in_java.chapter6_controllingExecution;

public class ForEachString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray() )
            System.out.println(c + " ");
    }
}
