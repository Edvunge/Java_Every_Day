package books.JavaNotesForProfessionals.chapter11_Strings.section11_8_Substrings;

public class Substrings {
    public static void main(String[] args) {
        String s = "this is an example";
        String a = s.substring(11);
        String b = s.substring(5, 10);
        String b1 = s.substring(5, b.length()-3);

        System.out.println("s: " + s);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("b1: " + b1);
    }
}
