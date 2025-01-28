package UdemyCourses.javaComOOP_MatheusBattisti.section06_functions;

public class FunctionsWithReturn002 {
    public static void main(String[] args) {
        // 1 - criando a primeira função
        saudacao();
        saudacao();
        saudacao();

        // 2 - parametros
        soma(2, 4);
        soma(8, 12);

        saudar("Matheus");

        // 3 - Return
        doubrar(4);

        int numero = 10;

        int numDoubrado = doubrar(numero);
        System.out.println("o numero dobrado eh: " + numDoubrado);
    }

    public static void saudacao() {
        System.out.println("ola esta é a minha primeira funcao!");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma eh: "+resultado);
    }

    public static void saudar(String nome) {

        System.out.println("Olá, " + nome + ", tudo bem?");

    }

    public static int doubrar(int n) {
        return n * 2;
    }
}
