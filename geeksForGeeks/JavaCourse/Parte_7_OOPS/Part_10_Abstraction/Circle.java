package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_10_Abstraction;

public class Circle implements Shaape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
