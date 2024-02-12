package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc02 {
    /*
        2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho e com os elementos do vetor A multiplicados
        por 2, ou seja: B[i] = A[i] * 2.
    */
    public static void main(String[] args) {
        int vetA[] = {4, 2, 8, 6, 10, 14, 12, 16};
        int vetB[] = new int[8];

        for (int j = 0; j < 8; j++) {
            vetB[j] = vetA[j] * 2;
        }


        System.out.println("\n");
        System.out.println("VETOR: A\n");
        for (int j = 0; j < 8; j++) {
            System.out.printf(" Pos[%d]: %d ",j ,vetA[j]);
        }

        System.out.println("\n");
        System.out.println("VETOR: B\n");
        for (int j = 0; j < 8; j++) {
            System.out.printf(" Pos[%d]: %d ",j ,vetB[j]);
        }

        System.out.println("\n");

    }
}