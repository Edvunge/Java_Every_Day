package books.JavaNotesForProfessionals.chapter11_Strings.section11_16_nthCharacter;

public class ChartAtExemple {
    public static void main(String[] args) {
        String str = "My String";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length()-1));
    }
}
