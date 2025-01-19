package books.JavaNotesForProfessionals.chapter11_Strings.section11_15_length;

public class Length {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.length());

        int len = str.codePointCount(0, str.length());
        System.out.println(len);

        //int leng = str.codePoints().count();
    }
}
