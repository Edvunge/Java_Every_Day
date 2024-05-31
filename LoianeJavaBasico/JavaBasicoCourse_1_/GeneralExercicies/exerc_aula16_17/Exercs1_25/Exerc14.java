package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

public class Exerc14 {
    // 14. Faça um programa que peça 10 números inteiros, calcule e mostre a
    //quantidade de números pares e a quantidade de números impares.
    public static void main(String[] args) {
        int quantdPares = 0, quantdImpares = 0;

        for (int j = 0; j < 10; j++) {
            if( j % 2 == 0) {
                quantdPares++;
            } else {
                quantdImpares++;
            }
        }

        System.out.println("Quantidade de pares: " + quantdPares);
        System.out.println("Quantidade de impares: " + quantdImpares);
    }
}
