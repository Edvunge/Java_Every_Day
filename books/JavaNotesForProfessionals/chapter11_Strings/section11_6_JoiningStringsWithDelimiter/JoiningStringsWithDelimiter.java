package books.JavaNotesForProfessionals.chapter11_Strings.section11_6_JoiningStringsWithDelimiter;

public class JoiningStringsWithDelimiter {
    public static void main(String[] args) {
        String[] elements = { "foo", "bar", "foobar" };
        String singleString = String.join(" + ", elements);

        System.out.println(singleString);
    }
}
