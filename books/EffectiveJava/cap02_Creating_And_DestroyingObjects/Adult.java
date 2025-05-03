package books.EffectiveJava.cap02_Creating_And_DestroyingObjects;

public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }
}
