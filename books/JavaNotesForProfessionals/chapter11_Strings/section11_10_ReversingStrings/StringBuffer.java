package books.JavaNotesForProfessionals.chapter11_Strings.section11_10_ReversingStrings;

public class StringBuffer {
    public static void main(String[] args) {
        String code = "uma string muito longa, extremamente longa";
        System.out.println(code);

        StringBuilder sb = new StringBuilder(code);
        code = sb.reverse().toString();

        System.out.println(code);
    }
}
