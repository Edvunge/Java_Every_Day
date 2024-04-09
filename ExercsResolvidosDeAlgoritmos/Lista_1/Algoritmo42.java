package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo42 {
    public static void main(String[] args) {
        // Entrar com  um angulo e graus e imprimir: seno, co-seno, tangente, secante
        // co-secante e co-tangente deste angulo
        Scanner input = new Scanner(System.in);

        double angulo, rang;
        final double PI = 3.1415;

        System.out.println("digite um angulo em graus: ");
        angulo = input.nextDouble();

        rang = (angulo*PI/180);

        System.out.printf("seno: %.2f\n" , Math.sin(rang));
        System.out.printf("co-seno: %.2f\n" , Math.cos(rang));
        System.out.printf("tangente: %.2f\n" , Math.tan(rang));
        System.out.printf("co-secante: %.2f\n" , (1/Math.cos(rang)));
        System.out.printf("secante: %.2f\n" , (1/Math.sin(rang)));
        System.out.printf("cotangente: %.2f\n" , (1/Math.tan(rang)));
    }
}
