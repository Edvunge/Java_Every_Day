package JavaNotesForProfessionals.cap11_Strings;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String s = new String("   Hello World!!  ");
        String t = s.trim(); // t = "Hello World!!"

        System.out.println(s);
        System.out.println(t);
    }
}
