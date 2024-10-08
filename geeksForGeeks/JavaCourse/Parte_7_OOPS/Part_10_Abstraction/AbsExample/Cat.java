package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_10_Abstraction.AbsExample;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}
