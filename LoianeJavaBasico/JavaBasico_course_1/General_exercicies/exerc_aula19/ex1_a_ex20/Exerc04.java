package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc04 {
    public static void main(String[] args) {
        /*
            4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
            mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
            raiz quadrada do respectivo elemento de A, ou seja:
            B[i] = sqrt(A[i]).
        */

        int len = 15;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21, 81, 61, 11, 91, 21};
        int vetB[] = new int[15];

        for (int j = 0; j < len; j++) {
            vetB[j] = (int) Math.sqrt(vetA[j]);
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
