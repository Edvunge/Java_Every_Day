package Freecodecamp.learnJava.Part02_dataTypes;

public class ImplicitNarrowingTypeConversion {
    public static void main(String[] args) {
        int number1 = 8;
        double number2 = number1;

        System.out.println(number2); // 8.0
    }
}
