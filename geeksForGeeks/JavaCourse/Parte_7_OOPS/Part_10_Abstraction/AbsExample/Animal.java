package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_10_Abstraction.AbsExample;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
