package books.JavaNotesForProfessionals.chapter22_BitManipulation;

import java.util.BitSet;
import java.util.stream.IntStream;

public class Bit_Set {
    public static void main(String[] args) {
        final BitSet bitSet = new BitSet(8);
        IntStream.range(0, 8).filter(i -> i % 2 == 0).forEach(bitSet::set);

        bitSet.set(3);
        bitSet.set(3, false);

        final boolean b = bitSet.get(3);
        bitSet.flip(6);
        bitSet.set(100);

        bitSet.and(new BitSet(8));
        bitSet.or(new BitSet(8));
        bitSet.xor(new BitSet(8));
        bitSet.andNot(new BitSet(8));
    }
}
