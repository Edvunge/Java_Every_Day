package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula47_exception;

public class Excecao {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];

            System.out.println("antes da exception");

            vetor[5] = 10;

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("excecao ao acessar um indice do vetor que nao existe");
        }

        System.out.println("esse texto sera impresso apos a exception");

    }
}
