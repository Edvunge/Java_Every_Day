package sites.devJava.oop.chapter01_class_and_objects;


public class CreateObjectDemo {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("Width of rectOne: "  + rectOne.width);
        System.out.println("Heigth of rectOne: " + rectOne.heigth);
        System.out.println("Area of rectOne: "   + rectOne.getArea());

        rectTwo.origin = originOne;

        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        System.out.println("Width and height are: " + rectOne.width + ", " + rectOne.heigth);
    }
}
