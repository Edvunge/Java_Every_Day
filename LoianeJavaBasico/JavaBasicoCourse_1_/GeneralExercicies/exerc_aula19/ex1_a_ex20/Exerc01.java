package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19;

public class Exerc01 {
    public static void main(String[] args) {
        /*
        1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
        */
        int vetorA[] = {2, 3, 4, 5, 6};
        int vetorB[] = new int[5];

        // Vetore A:
        System.out.println("VETOR: A\n");
        for (int j = 0; j < 5; j++) {
            System.out.printf(" %d ",vetorA[j]);
        }

        System.out.println("\n\n - - - - - - - - - - \n");

        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[i];
        }


        // Vetore B:
        System.out.println("VETOR: B\n");
        for (int j = 0; j < 5; j++) {
            System.out.printf(" %d ",vetorB[j]);
        }

    }
}
