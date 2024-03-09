package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19;

public class Exerc12 {
    public static void main(String[] args) {
        /*
            12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que defina e escreva a soma de todos os elementos armazenados neste vetor.
        */

        int len = 10;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int soma = 0;

        for (int j = 0; j < len; j++) {
            soma += vetA[j];
        }

        System.out.printf("Soma de todos os elementos do vetor: %d ",soma);
    }
}
