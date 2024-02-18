package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc15 {
    public static void main(String[] args) {
        /*
            15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
            que defina o percentual de elementos pares e ímpares,
            respectivamente, armazenados neste vetor.
        */

        //int len = 10;
        int vetorA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        // Contadores para elementos pares e ímpares
        int countPares = 0;
        int countImpares = 0;

        for (int elemento : vetorA) {
            if (elemento % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }


        double percentualPares = (double) countPares / vetorA.length * 100;
        double percentualImpares = (double) countImpares / vetorA.length * 100;


        System.out.println("Vetor A: " + java.util.Arrays.toString(vetorA));
        System.out.println("Percentual de elementos pares: " + percentualPares + "%");
        System.out.println("Percentual de elementos ímpares: " + percentualImpares + "%");

    }
}
