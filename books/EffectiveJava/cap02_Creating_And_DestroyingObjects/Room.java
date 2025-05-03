package books.EffectiveJava.cap02_Creating_And_DestroyingObjects;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
    private static final Cleaner  cleaner = Cleaner.create();

    // Resource that requires cleanning. Must not refer to Room!
    private static class State implements Runnable {
        int numjunkPiles; // Number of junk piles in this room

        State(int numjunkPiles) {
            this.numjunkPiles = numjunkPiles;
        }

        // Invoked by close method or cleaner
        @Override public void run() {
            System.out.println("Cleaning room");
            numjunkPiles = 0;
        }
    }

    // The state of this room, shared with our cleanable
    private final State state;

    // Our cleanable, Cleans the room when it's eligible for gc
    private final Cleaner.Cleanable cleanable;

    public Room(int numjunkPiles) {
        state = new State(numjunkPiles);
        cleanable = cleaner.register(this, state);
    }
    @Override public void close() {
        cleanable.clean();
    }
}
