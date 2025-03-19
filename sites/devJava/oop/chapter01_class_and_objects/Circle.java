package sites.devJava.oop.chapter01_class_and_objects;

public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int i, int i1) {

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveCircle(Circle circle, int deltaX, int deltaY) {
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        circle = new Circle(0, 0);
    }
}
