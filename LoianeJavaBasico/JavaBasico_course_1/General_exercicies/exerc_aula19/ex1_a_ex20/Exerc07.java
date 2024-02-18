package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc07 {
    public static void main(String[] args) {
        /*
            7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
            um vetor C, onde cada elemento de C é a subtração dos respectivos
            elementos em A e B, ou seja: C[i] = A[i] – B[i].
        */
        int len = 10;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int vetB[] = {42, 22, 28, 26, 10, 14, 12, 16, 14, 12};
        int vetC[] = new int[10];

        for (int j = 0; j < len; j++) {
            vetC[j] = vetA[j] - vetB[j];
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
        System.out.println("VETOR: C\n");
        for (int j = 0; j < len; j++) {
            System.out.printf(" Pos[%d]: %d ",j ,vetC[j]);
        }
    }
}
