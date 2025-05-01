package Freecodecamp.theJavaHandbook.how6_toInputtingANDoutput;

import java.util.Scanner;

public class ScannerClose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("So %s. How old are you? " , name);
        int age = scanner.nextInt();

        //scanner.nextLine();

        System.out.printf("Cool! %d is a good age to start programming. \nWhat language would you prefer? ", age);
        String language = scanner.nextLine();

        System.out.printf("Ah! %s is a solid programming language.", language);

        scanner.close();
    }
}
