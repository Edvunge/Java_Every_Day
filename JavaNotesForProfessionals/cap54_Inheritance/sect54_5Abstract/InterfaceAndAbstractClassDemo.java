package JavaNotesForProfessionals.cap54_Inheritance.sect54_5Abstract;

import JavaNotesForProfessionals.cap24_Collections.App;

public class InterfaceAndAbstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("jack", 16);
        Cat cat = new Cat("joeb", 28);

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);

        dog.remember();
        dog.protectOwner();
        Learn d1 = dog;
        d1.learn();

        cat.remember();
        cat.protectOwner();

        Climb c = cat;
        c.climb();

        Man man = new Man("Ravindra", 40);
        System.out.println(man);

        Climb cm = man;
        cm.climb();

        Think t = man;
        t.think();

        Learn l = man;
        l.learn();

        Apply a = man;
        a.apply();
    }
}
