package books.Thinking_in_java.chapter6_controllingExecution;

import static java.io.IO.print;

public class If_Else {
    static int result = 0;
    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0; // Match
    }

    public static void main(String[] args) {
        test(10, 5);
        print(result);

        test(5, 10);
        print(result);

        test(5, 5);
        print(result);
    }
}
