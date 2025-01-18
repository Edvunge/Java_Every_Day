package books.JavaNotesForProfessionals.chapter11_Strings.section11_6_JoiningStringsWithDelimiter;

import java.util.StringJoiner;

public class String_joiner {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[","]");
        sj.add("foo");
        sj.add("bar");
        sj.add("foobar");

        System.out.println(sj);
    }
}
