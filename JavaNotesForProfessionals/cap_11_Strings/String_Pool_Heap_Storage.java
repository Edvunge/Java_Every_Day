package JavaNotesForProfessionals.cap_11_Strings;

public class String_Pool_Heap_Storage {
    public static void main(String[] args) {
        String a = "alpha";
        String b = "alpha";
        String c = new String("alpha");

        // All three strings are equivalent
        System.out.println(a.equals(b) && b.equals(c));

        System.out.println(a == b);
        System.out.println(a != c);
        System.out.println(b != c);
    }
}
