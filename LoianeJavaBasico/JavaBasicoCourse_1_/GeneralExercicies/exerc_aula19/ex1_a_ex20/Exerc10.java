package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19;

public class Exerc10 {
    public static void main(String[] args) {
        /*
            10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
            mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
            ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
            seja: B[i] = A[i] % 2.
        */
        int len = 10;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int vetB[] = {42, 22, 28, 26, 10, 14, 12, 16, 14, 12};

        for (int j = 0; j < len; j++) {
            vetB[j] = vetA[j] % 2;
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
