package sites.devJava.oop.chapter01_class_and_objects;

public class Rectangle {
    public int width = 0;
    public int heigth = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        heigth = h;
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        heigth = h;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return width * heigth;
    }
}
