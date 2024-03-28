package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.O_Excecoes.test.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
        System.out.println("Codigo finalizado");
    }


    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("Argumento ilegal, nao pode ser 0");
        }
        return a/b;
    }
}
