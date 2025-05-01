package Freecodecamp.theJavaHandbook.how6_toInputtingANDoutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("So %s. How old are you? "+ name);
        int age = scanner.nextInt();

        System.out.printf("Cool! %d is a good age to start programming.", age);

        scanner.close();
    }
}
