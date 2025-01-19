package books.JavaNotesForProfessionals.chapter13_StringBuilder;

import java.util.Formatter;

public class FormatterExamples {
    public static void main(String[] args) {
        int one = 1;
        String color = "red";
        Formatter f = new Formatter();
        System.out.println(f.format("One=%d, colour=%s%n", one, color));

        System.out.println(String.format("One%d, color=%s%n", one, color));
    }
}
