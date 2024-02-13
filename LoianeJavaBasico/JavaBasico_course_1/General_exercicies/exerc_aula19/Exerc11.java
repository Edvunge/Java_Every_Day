package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc11 {
    public static void main(String[] args) {
        /*
            11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
            que defina e escreva a quantidade de elementos armazenados neste
            vetor que são pares.
        */
        int len = 10;
        int vetA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int quantiddPares = 0, quantiddImpares = 0;

        for (int j = 0; j < len; j++) {
            if (vetA[j] % 2 == 0) {
                quantiddPares++;
            } else {
                quantiddImpares++;
            }
        }

        System.out.printf("Existem %d numeros pares neste vetor.\n",quantiddPares);
        System.out.printf("Existem %d numeros impares neste vetor.\n",quantiddImpares);
    }
}
