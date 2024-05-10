package geeksForGeeks.JavaCourse.Parte_7_OOPS.Abstraction.AbsExample;

abstract class Shape {
    public String color;

    // these are abstrct methods
    abstract double area();
    public abstract String toString();

    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
