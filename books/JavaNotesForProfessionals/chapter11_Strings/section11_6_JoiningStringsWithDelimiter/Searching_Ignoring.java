package books.JavaNotesForProfessionals.chapter11_Strings.section11_6_JoiningStringsWithDelimiter;

public class Searching_Ignoring {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "wOr";
        str1.indexOf(str2);
        str1.toLowerCase().contains(str2.toLowerCase());
        str1.toLowerCase().indexOf(str2.toLowerCase());
    }
}
