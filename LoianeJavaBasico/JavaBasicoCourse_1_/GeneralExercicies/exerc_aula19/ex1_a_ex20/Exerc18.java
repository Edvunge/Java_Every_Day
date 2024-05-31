package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19;

public class Exerc18 {
    /*
        18.Ler um vetor A com 10 elementos inteiros correspondentes as idades
        de um grupo de pessoas. Escreva um programa que determine e
        escreva a menor e a maior idades e suas respectivas posições.
     */
    public static void main(String[] args) {
        int lengthArray = 10;
        int vetA_age[] = {2, 3, 9, 12, 8, 4, 9, 5, 10, 6};
        int minValue = Integer.MAX_VALUE; // Inicializa com o maior valor possível para int
        int maxValue = Integer.MIN_VALUE; // Inicializa com o menor valor possível para int
        //int minValue = 2020, maxValue = 0;
        int minPosition = 0, maxPosition = 0;

        for (int j = 0;  j < lengthArray; j++){
            if(vetA_age[j] > maxValue) {
                maxValue = vetA_age[j];
                maxPosition = j;
            } else if (vetA_age[j] < minValue) {
                minValue = vetA_age[j];
                minPosition = j;
            }
        }
        System.out.printf("\nO Maior valor: %d , na posicao: %d",maxValue ,maxPosition);
        System.out.printf("\nO Menor valor: %d , na posicao: %d",minValue ,minPosition);
    }
}
