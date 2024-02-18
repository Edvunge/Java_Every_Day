package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc14 {
    public static void main(String[] args) {
        /*
            14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que defina e escreva a média aritmética simples dos elementos
            ímpares armazenados neste vetor.
        */
        int len = 10;
        int vetA[] = {34, 32, 38, 36, 323, 421, 21, 23, 41, 21};
        int soma = 0;
        double mediaAritmetica = 0.0;

        for (int y = 0; y < len; y++) {
            if (vetA[y] % 2 != 0) {
                soma += vetA[y];
            }
        }

        mediaAritmetica = (soma / len);
        System.out.printf("A media aritmetica simples dos impares e de: %.2f ",mediaAritmetica);
    }
}
