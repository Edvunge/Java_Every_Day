package UdemyCourses.javaComOOP_MatheusBattisti.section06_functions;

public class FunctionWithArguments001 {
    public static void main(String[] args) {
        soma(4, 6);
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma eh: "+resultado);
    }
}
