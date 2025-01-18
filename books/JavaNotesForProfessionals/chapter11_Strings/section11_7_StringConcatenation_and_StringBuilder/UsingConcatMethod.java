package books.JavaNotesForProfessionals.chapter11_Strings.section11_7_StringConcatenation_and_StringBuilder;

public class UsingConcatMethod {
    public static void main(String[] args) {
        String string1 = "Hello ";
        String string2 = "world";
        String string3 = string1.concat(string2);

        System.out.println(string3);
        System.out.println("My name is ".concat("Buyya"));
    }
}
