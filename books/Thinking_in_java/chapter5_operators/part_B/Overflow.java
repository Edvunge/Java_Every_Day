package books.Thinking_in_java.chapter5_operators.part_B;

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);

        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
