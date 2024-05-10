package geeksForGeeks.JavaCourse.Parte_7_OOPS.Abstraction.AbsExample;

class Circle extends Shape  {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circule constructor called");
        this.radius = radius;
    }

    @Override double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString() {
        return "Circle color is " + super.getColor() + "and are is : " + area();
    }
}