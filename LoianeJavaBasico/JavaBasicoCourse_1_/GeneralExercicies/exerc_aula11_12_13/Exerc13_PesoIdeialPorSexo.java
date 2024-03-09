package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc13_PesoIdeialPorSexo {
    // 13.Tendo como dados de entrada a altura e o sexo de uma pessoa,
    //construa um algoritmo que calcule seu peso ideal, utilizando as
    //seguintes fórmulas:
    //      Para homens: (72.7*h) - 58
    //      a. Para mulheres: (62.1*h) - 44.7 (h = altura)
    //      b. Peça o peso da pessoa e informe se ela está dentro, acima ou
    //      abaixo do peso.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        String sexo = sc.next();

        System.out.println("Digite a sua altura: ");
        double altura_h = sc.nextDouble();

        if(sexo.equals("h")){
            // (72.7*h) - 58
            double peso_ideial_h = ((72.7 * altura_h) - 58);
            System.out.println("\nO seu peso ideial: " + peso_ideial_h);
        } else {
            // (62.1*h) - 44.7 (h = altura)
            double peso_ideial_m = (62.1 * altura_h) - 44.7;
            System.out.println("\nO seu peso ideial: " + peso_ideial_m);
        }
        sc.close();
    }
}