package JavaNotesForProfessionals.cap10_PrimitiveDataTypes;

public class IntPrimitive {
    public static void main(String[] args) {
        int example = -42;
        int myInt = 284;
        int anotherInt = 73;

        int addedInts = myInt + anotherInt; // 284 + 73 = 357
        int subtractedInts = myInt - anotherInt; // 284 - 73 = 211

        int demo = 2147483647; //maximum positive integer
        System.out.println(demo); //prints 2147483647
        demo = demo + 1; //leads to an integer overflow
        System.out.println(demo); // prints -2147483648

        // The maximum and minimum values of int can be found at:
        int high = Integer.MAX_VALUE; // high == 2147483647
        int low = Integer.MIN_VALUE; // low == -2147483648

        // The default value of an int is 0
        int defaultInt; // defaultInt == 0
    }
}
