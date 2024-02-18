package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc03 {
    public static void main(String[] args) {
        /*
            3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
            ser o quadrado do respectivo elemento de A, ou seja:
            B[i] = A[i] * A[I].
        */
        int len = 15;
        int vetA[] = {4, 2, 8, 6, 10, 14, 12, 16, 14, 12, 18, 16, 111, 191, 121};
        int vetB[] = new int[len];

        for (int j = 0; j < len; j++) {
            vetB[j] = vetA[j] * vetA[j];
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