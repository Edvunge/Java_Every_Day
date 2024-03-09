package LearnJavaInYminutes;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Output

        System.out.println("Hello World!");
        System.out.println("Integer: " + 10 + " Double: " + 3.14 + " Boolean: " + true);

        System.out.println("Hello ");
        System.out.println("World");

        System.out.printf("pi = %.5f", Math.PI);


        // Input

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        byte numByte = scanner.nextByte();

        int numInt = scanner.nextInt();

        long numLong = scanner.nextLong();

        float numFloat = scanner.nextFloat();

        double numDouble = scanner.nextDouble();

        boolean bool = scanner.nextBoolean();


    }
}
