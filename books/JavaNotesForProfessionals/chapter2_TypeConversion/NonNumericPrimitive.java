package books.JavaNotesForProfessionals.chapter2_TypeConversion;

public class NonNumericPrimitive {
    public static void main(String[] args) {
        //int badInt = (int) true;
        char char1 = (char) 65;
        byte byte1 = (byte) 'A';
        short short1 = (short) 'A';
        int int1 = (int) 'A';

        char char2 = (char) 8253;
        byte byte2 = (byte) '?';
        short short2 = (short) '?';
        int int2 = (int) '?';

        System.out.println("char1  " + char1);
        System.out.println("byte1  " + byte1);
        System.out.println("short1 " + short1);
        System.out.println("int1   " + int1);
        System.out.println("char2  " + char2);
        System.out.println("byte2  " + byte2);
        System.out.println("short2 " + short2);
        System.out.println("int2   " + int2);
    }
}
