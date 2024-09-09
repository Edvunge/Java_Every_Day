package JavaNotesForProfessionals.cap56_Console_InputOutput.sect56_1ReadingUserInput;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        System.out.println("Please type your name and press enter");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
