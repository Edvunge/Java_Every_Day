package geeksForGeeks.JavaCourse.Parte_4_OperatorsInJava;

public class UnaryNotOperator {
    public static void main(String[] args) {
        boolean cond = true;
        int a = 10, b = 1;

        System.out.println("Cond is: " + cond);
        System.out.println("Var = " + a);
        System.out.println("Var = " + b);

        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) : " + !(a < b));
        System.out.println("!(a > b) : " + !(a > b));
    }
}
