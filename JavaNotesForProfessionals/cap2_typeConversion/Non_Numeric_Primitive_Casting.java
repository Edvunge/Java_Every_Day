package JavaNotesForProfessionals.cap2_typeConversion;

public class Non_Numeric_Primitive_Casting {
    public static void main(String[] args) {

       // int badInt = (int) true;       // compiler error: incompatible types
        char char1 = (char)      65;   // A
        byte byte1 = (byte)      'A';  // 65
        short short1 = (short)   'A';  // 65
        int int1  = (int)        'A';  // 65

        char char2 = (char)     8253;   // ?
        byte byte2 = (byte)       '?';  // 61 (truncated code-point int the ASCII range)
        short short2 = (short)    '?';  // 8253
        int int2 = (int)          '?';  // 8253
    }
}
