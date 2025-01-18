package books.JavaNotesForProfessionals.chapter11_Strings.section11_1_ComparingStrings;

public class ComparingStrings {
    public static void main(String[] args) {
        String firstString = "Test123";
        String secondString = "Test" + 123;

        if (firstString.equals(secondString)) {
            // Both Strings have the same content.
        }
    }
}
