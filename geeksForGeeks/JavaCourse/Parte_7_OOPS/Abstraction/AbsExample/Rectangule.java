package geeksForGeeks.JavaCourse.Parte_7_OOPS.Abstraction.AbsExample;

public class Rectangule extends  Shape {
    double length;
    double width;

    public Rectangule(String color, double length, double width) {
        super(color);
        System.out.println("Rectangule constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString() {
        return "Rectangle color is " + super.getColor() +
                "and area is : " + area();
    }
}
