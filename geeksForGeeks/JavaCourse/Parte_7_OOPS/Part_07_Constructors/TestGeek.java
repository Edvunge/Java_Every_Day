package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_07_Constructors;

public class TestGeek {
    public static void main(String[] args) {
        Geek geek1 = new Geek("Avinash", 68);
        System.out.println("GeekName : " + geek1.name + " and GeekId : " + geek1.id);
    }
}
