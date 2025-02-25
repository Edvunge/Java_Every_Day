package books.JavaNotesForProfessionals.chapter22_BitManipulation.section22_6_PackingUnpacking_values;

public class Unpacking_The_Values {
    public static void main(String[] args) {
        int x = 0x31FF65;

        byte[] c = {
                (byte) (x >> 16),
                (byte) (x >> 8),
                (byte) (x & 0xFF)
        };

        byte[] d = {
                (byte) (x & 0xFF),
                (byte) (x >> 8),
                (byte) (x >> 16)
        };

        System.out.println(x);
        System.out.println(c);
        System.out.println(d);
    }
}
