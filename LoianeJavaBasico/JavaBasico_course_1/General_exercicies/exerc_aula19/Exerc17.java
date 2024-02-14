package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc17 {
    /*
        17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
        de um grupo de pessoas. Escreva um programa que determine e
        escreva a quantidade de pessoas que possuem idade superior a 35 anos.
    */

    public static void main(String[] args) {
        int len = 12;
        int vetorA_Idades[] = {123, 34, 32, 38, 36, 32, 40, 21, 62, 41, 21 ,55};
        int idadSuperior = 0;

        for (int j = 0; j < len; j++) {
            if (vetorA_Idades[j] > 35) {
                idadSuperior++;
            }
        }

        System.out.printf("A quantidade de funcionarios com idade superior a 35 e de: %d",idadSuperior);
    }
}
