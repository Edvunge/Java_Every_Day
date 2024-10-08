package geeksForGeeks.JavaCourse.Parte_7_OOPS.Part_09_Inheritance.Part04_MultipleInheritanceThroughInterfaces;

public class Child implements Three {
    @Override public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for() {
        System.out.println("for");
    }
}
