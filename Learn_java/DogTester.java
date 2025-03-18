package Learn_java;

import java.util.ArrayList;

public class DogTester {
    public static void main(String [] args) {
        Dog d = new Dog(new LicName("Brady the Blue Brindle", "Brady"), "Whippet", 46.7);
        Cat c = new Cat("Sweetie", "Siamese", 7.5);
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(d);
        animals.add(c);

        for (Animal a: animals) {
            if (a instanceof Dog(LicName(_,String nickname), _, _)) {
                System.out.println(nickname);
            }

            if (a instanceof Cat(String n, _, _)) {
                System.out.println(n);
            }
        }
    }
}

sealed interface Animal permits Dog, Cat {
}

record Dog(LicName name, String Breed, double weight) implements Animal {
}

record Cat(String name, String Breed, double weight) implements Animal {
}

record LicName(String fullName, String nickname) {
}

