package geeksForGeeks.JavaCourse.Basics_of_java;

public class VariablesFirstPart {
    public static void main(String[] args) {
        int var = 10;
        System.out.println("Local Variable: " + var);

        // x is a local variables
        int x = 10;

        String message = "Hello, World!";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            String result = "x is greater than 5";
            System.out.println(result);
        }

        for (int i = 0; i < 3; i++) {
            String loopMessage = "Iteration " + i;
            System.out.println(loopMessage);
        }
    }
}
