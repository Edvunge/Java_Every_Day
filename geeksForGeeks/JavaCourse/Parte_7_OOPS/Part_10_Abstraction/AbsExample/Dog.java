package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_10_Abstraction.AbsExample;

public class Dog extends  Animal{
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + "barks");
    }
}
