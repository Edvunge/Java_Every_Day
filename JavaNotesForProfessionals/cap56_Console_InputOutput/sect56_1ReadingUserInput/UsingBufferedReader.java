package JavaNotesForProfessionals.cap56_Console_InputOutput.sect56_1ReadingUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReader {
    public static void main(String[] args) {
        System.out.println("Please type your name and press Enter.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                String name = reader.readLine();
                System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
