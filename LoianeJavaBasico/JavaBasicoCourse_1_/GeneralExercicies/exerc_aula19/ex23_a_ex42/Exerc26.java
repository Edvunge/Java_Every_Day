package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19.ex23_a_ex42;

public class Exerc26 {
       /*
        26. Criar dois vetores A e B cada um com 10 elementos inteiros.
        Construir um vetor C de mesmo tipo e tamanho,
        obedecendo as seguintes regras de formação:

        a) C[i] deverá receber  1  quando A[i] for maior que B[i];
        b) C[i] deverá receber  0  quando A[i] for igual a B[i];
        c) C[i] deverá receber -1  quando A[i] for menor que B[i].
     */
       public static void main(String[] args) {
           int lentghARRAY = 10;
           int vetA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
           int vetB[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
           int[] vetC = new int[10];

            for (int i = 0; i < lentghARRAY; i++) {
                if (vetA[i] > vetB[i]) {
                    System.out.printf("\n vetC[%d]: %d ",i ,vetC[i]=1);
                } else if (vetA[i] == vetB[i]) {
                    System.out.printf("\n vetC[%d]: %d ",i ,vetC[i]=0);
                } else if (vetA[i] < vetB[i]) {
                    System.out.printf("\n vetC[%d]: %d ",i ,vetC[i]=-1);
                }
            }
       }
}
