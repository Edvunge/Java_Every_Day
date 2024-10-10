package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_03_ClassesAndObjects;

public class Example03 implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        Example03 obj1 = new Example03();

        try {
            Example03 obj2 = (Example03) obj1.clone();
            System.out.println(obj2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
