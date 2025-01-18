package books.JavaNotesForProfessionals.chapter11_Strings.section11_7_StringConcatenation_and_StringBuilder;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s = s1 + s2 +s3; // abc
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s: " + s);
    }
}
