package JavaNotesForProfessionals.cap57_Streams.sect57_2ConsumingStreams;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        try {
            IntStream.range(1, 10).filter(null);
        } catch (NullPointerException e) {
            System.out.println("We got a NullPointerException as null was passed as an argument to filter()");
        }
    }
}
