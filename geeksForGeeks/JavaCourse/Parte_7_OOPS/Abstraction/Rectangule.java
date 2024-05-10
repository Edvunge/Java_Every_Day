package geeksForGeeks.JavaCourse.Parte_7_OOPS.Abstraction;

public class Rectangule implements Shaape {
    private double length;
    private double width;

    public Rectangule(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
