package books.JavaNotesForProfessionals.chapter2_TypeConversion;

public class BasicNumeric {
    public static void main(String[] args) {
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        int1 = char1 + char2;
        int1 = short1 + short2;
        int1 = char1 + short2;
        float1 = short1 + float2;
        int1 = int1 + int2;

        System.out.println("int1:   " + int1);
        System.out.println("int2:   " + int2);
        System.out.println("char1:  " + char1);
        System.out.println("char2:  " + char2);
        System.out.println("float1: " + float1);
        System.out.println("float2: " + float2);
    }
}
