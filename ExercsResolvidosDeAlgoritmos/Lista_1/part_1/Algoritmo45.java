package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo45 {
    public static void main(String[] args) {
        // Entrar com numero e imprimir a seguinte saida:
        // numero:
        // quadrado:
        // raiz
        Scanner input = new Scanner(System.in);
        double num, quad, raizQuadrad;

        System.out.println("digite numero: ");
        num = input.nextDouble();

        quad = (num * num);
        raizQuadrad = Math.sqrt(num);

        System.out.println("numero: " + num);
        System.out.println("quadrado: " + quad);
        System.out.println("raizQuadrada: " + raizQuadrad);
    }
}
