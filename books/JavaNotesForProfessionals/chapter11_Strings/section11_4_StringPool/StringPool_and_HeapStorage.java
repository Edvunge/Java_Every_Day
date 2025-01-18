package books.JavaNotesForProfessionals.chapter11_Strings.section11_4_StringPool;

public class StringPool_and_HeapStorage {
    public static void main(String[] args) {
        String a = "alpha";
        String b = "alpha";
        String c = new String("alpha");

        System.out.println(a.equals(b) && b.equals(c));

        System.out.println(a == b);
        System.out.println(a != c);
        System.out.println(b != c);
    }
}
