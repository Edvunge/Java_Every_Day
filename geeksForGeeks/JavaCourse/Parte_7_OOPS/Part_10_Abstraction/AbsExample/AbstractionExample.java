package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_10_Abstraction.AbsExample;

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Fluffy");

        myDog.makeSound();
        myCat.makeSound();
    }
}