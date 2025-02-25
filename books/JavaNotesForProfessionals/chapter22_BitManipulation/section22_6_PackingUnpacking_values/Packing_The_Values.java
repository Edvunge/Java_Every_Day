package books.JavaNotesForProfessionals.chapter22_BitManipulation.section22_6_PackingUnpacking_values;

public class Packing_The_Values {
    public static void main(String[] args) {
        byte[] b = {
                (byte)0x65,
                (byte)0xFF,
                (byte)0x31
        };

        int x = (b[0] & 0xFF) << 16 // Red
              | (b[1] & 0xFF) << 8  // Green
              | (b[2] & 0xFF) << 0; // Blue

        int y = (b[0] & 0xFF) <<  0
              | (b[1] & 0xFF) <<  8
              | (b[2] & 0xFF) << 16;

        System.out.println(x);
        System.out.println(y);
    }
}
