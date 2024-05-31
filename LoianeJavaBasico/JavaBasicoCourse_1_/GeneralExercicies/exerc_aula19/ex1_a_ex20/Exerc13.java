package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19;

public class Exerc13 {
    public static void main(String[] args) {
        /*
            13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.
        */

        int len = 10;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int soma = 0;

        for (int y = 0; y < len; y++) {
            if (vetA[y] % 5 == 0) {
                soma += vetA[y];
            }
        }

        System.out.printf("Os elementos multiplos por 5: %d ",soma);
    }
}
