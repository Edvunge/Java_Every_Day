package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19.ex23_a_ex42;

public class Exerc27 {
     /*
        27.Criar um vetor A com 10 elementos inteiros.
        Construir um vetor B de mesmo tipo e tamanho,
        obedecendo as seguintes regras de formação:

        a) B[i] deverá receber 'a' quando A[i] for menor que 7;
        b) B[i] deverá receber 'b' quando A[i] for igual a 7;
        c) B[i] deverá receber 'c' quando A[i] for maior que 7 e menor que 10;
        d) B[i] deverá receber 'd' quando A[i] for igual a 10; e
        e) B[i] deverá receber 'e' quando A[i] for maior que 10. Sugestão: char B[10];
     */
     public static void main(String[] args) {
         int lentghARRAY = 10;
         int vetA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         char[] vetB = new char[10];

         for (int i = 0; i < lentghARRAY; i++){
             if (vetA[i] < 7) {
                 System.out.printf("\n vetB[%d]: %c ",i ,vetB[i] = 'a');
             } else if (vetA[i] == 7) {
                 System.out.printf("\n vetB[%d]: %c ",i ,vetB[i] = 'b');
             } else if (vetA[i] > 7 && vetA[i] < 10) {
                 System.out.printf("\n vetB[%d]: %c ",i ,vetB[i] = 'c');
             } else if (vetA[i] == 10) {
                 System.out.printf("\n vetB[%d]: %c ",i ,vetB[i] = 'd');
             } else if (vetA[i] > 10) {
                 System.out.printf("\n vetB[%d]: %c ",i ,vetB[i] = 'e');
             }
         }
     }
}
