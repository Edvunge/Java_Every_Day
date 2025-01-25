package books.JavaNotesForProfessionals.chapter18_LocalTime;

import java.time.LocalTime;

public class section18_3_TimeModification {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime addHours = time.plusHours(5);
        LocalTime addMinutes = time.plusMinutes(15);
        LocalTime addSeconds = time.plusSeconds(30);
        LocalTime addNanoseconds = time.plusNanos(150_000_000);

        System.out.println("addHours: " + addHours);
        System.out.println("addMinutes: " + addMinutes);
        System.out.println("addSeconds: " + addSeconds);
        System.out.println("addNanoseconds: " + addNanoseconds);
    }
}
