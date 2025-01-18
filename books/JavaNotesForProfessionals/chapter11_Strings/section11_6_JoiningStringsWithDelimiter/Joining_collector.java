package books.JavaNotesForProfessionals.chapter11_Strings.section11_6_JoiningStringsWithDelimiter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining_collector {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
        String joined = stringStream.collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}
