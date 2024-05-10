package geeksForGeeks.JavaCourse.Parte_7_OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        Rectangule myRectangle = new Rectangule(4.0, 6.0);

        System.out.println("Area of circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}
