package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_10_Abstraction.AbsExample;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangule("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}