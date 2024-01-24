package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc12_PesoIdeial {
    // 12.Tendo como dados de entrada a altura de uma pessoa, construa um
    //  algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
    //  (72.7*altura) - 58
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura_h = sc.nextDouble();

        double peso_ideial = ((72.7 * altura_h) - 58);
        System.out.println("Peso Ideial: " + peso_ideial);
        sc.close();
    }
}