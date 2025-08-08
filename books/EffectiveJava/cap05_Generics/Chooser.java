package books.EffectiveJava.cap05_Generics;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {
    private final Object[] choicesArray;

    public Chooser(Collection choices) {
        choicesArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choicesArray[rnd.nextInt(choicesArray.length)];
    }
}
