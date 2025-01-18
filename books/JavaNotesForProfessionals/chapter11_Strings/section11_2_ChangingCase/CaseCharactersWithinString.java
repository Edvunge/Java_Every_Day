package books.JavaNotesForProfessionals.chapter11_Strings.section11_2_ChangingCase;

public class CaseCharactersWithinString {
    public static void main(String[] args) {
        String string = "This is a Random String";
        String upper = string.toUpperCase();
        String lower = string.toLowerCase();

        System.out.println("string: " + string);
        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);
    }
}
