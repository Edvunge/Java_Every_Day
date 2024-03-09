package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19.ex23_a_ex42;

public class Exerc25 {
      /*
        25. Criar um vetor A com 10 elementos inteiros.
        Construir um vetor B de mesmo tipo e tamanho,
        obedecendo as seguintes regras de formação:

        a) Bi deverá receber 1 quando Ai for par;
        b) Bi deverá receber 0 quando Ai for ímpar.
     */
      public static void main(String[] args) {
          int lentghARRAY = 10;
          int vetA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
          int vetB[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

          for (int i = 0; i < lentghARRAY; i++) {
              if(vetA[i] % 2 == 0) {
                  System.out.printf("\n vetA[%d]: %d ",i ,vetA[i]=1);
              } else {
                  System.out.printf("\n vetA[%d]: %d ",i ,vetA[i]=0);
              }
          }
      }
}
