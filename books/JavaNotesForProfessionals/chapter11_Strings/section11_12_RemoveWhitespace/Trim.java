package books.JavaNotesForProfessionals.chapter11_Strings.section11_12_RemoveWhitespace;

public class Trim {
    public static void main(String[] args) {
        String s = new String("     Hello World!!   ");
        String t = s.trim();
        System.out.println(s);
        System.out.println(t);
    }
}
