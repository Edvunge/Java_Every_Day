package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc05 {
    public static void main(String[] args) {
        /*
            5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
            ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja:
            B[i] = A[i] * i.
        */

        int len = 10;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int vetB[] = new int[10];

        for (int j = 0; j < len; j++) {
            vetB[j] = vetA[j] * j;
        }

        System.out.println("\n");
        System.out.println("VETOR: A\n");
        for (int j = 0; j < len; j++) {
            System.out.printf(" Pos[%d]: %d ",j ,vetA[j]);
        }

        System.out.println("\n");
        System.out.println("VETOR: B\n");
        for (int j = 0; j < len; j++) {
            System.out.printf(" Pos[%d]: %d ",j ,vetB[j]);
        }

        System.out.println("\n");

    }
}
