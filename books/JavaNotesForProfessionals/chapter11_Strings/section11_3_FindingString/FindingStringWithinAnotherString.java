package books.JavaNotesForProfessionals.chapter11_Strings.section11_3_FindingString;

public class FindingStringWithinAnotherString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println(str1.contains(str2));
        System.out.println(str1.contains(str3));
    }
}
