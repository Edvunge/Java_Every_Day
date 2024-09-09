package JavaNotesForProfessionals.cap56_Console_InputOutput.sect56_1ReadingUserInput;

public class UsingSystemConsole {
    public static void main(String[] args) {
        String name = System.console().readLine("Please tpe your name and press Enter%n");

        System.out.println("Hello, %s!" + name);

        //To read passwords (without echoing as in unix terminal)
        char[] password = System.console().readPassword();
    }
}
