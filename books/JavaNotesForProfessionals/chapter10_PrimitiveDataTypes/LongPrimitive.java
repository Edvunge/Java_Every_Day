package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class LongPrimitive {
    public static void main(String[] args) {
        long example = -42;
        long myLong = 284;
        long anotherLong = 73;

        long bigNumber = 549755813888L;

        long addedLongs = myLong + anotherLong;
        long subtractedLongs = myLong - anotherLong;
        System.out.println("addedLongs: " + addedLongs);
        System.out.println("subtractedLongs: " + subtractedLongs);

        long high = Long.MAX_VALUE;
        long low = Long.MIN_VALUE;
        System.out.println("high: " + high);
        System.out.println("low: " + low);
    }
}
