package books.Thinking_in_java.chapter5_operators.part_B;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i;
        long lgn2 = (long) 200;
        lgn2 = 200;
        // A "narrowing conversion":
        i = (int)lgn2; // Cast required
    }
}
