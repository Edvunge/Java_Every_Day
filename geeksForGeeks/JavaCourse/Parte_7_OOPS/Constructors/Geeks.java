package geeksForGeeks.JavaCourse.Parte_7_OOPS.Constructors;

public class Geeks {
    Geeks() {
        super();
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        Geeks geeks = new Geeks();
    }
}