package geeksForGeeks.JavaCourse.Parte_7_OOPS.Abstraction.AbsExample;

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
