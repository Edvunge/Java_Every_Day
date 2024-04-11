package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Algoritmo51 {
    public static void main(String[] args) {
        // Entrar com o raio de um circulo e imprimir a seguinte saida:
        // perimetro:
        // area:
        Scanner input = new Scanner(System.in);
        double raio, perimetro, area;

        System.out.println("digite raio: ");
        raio = input.nextDouble();

        perimetro = 2* PI * raio;

        area = PI * raio * (2*2);

        System.out.println("perimetro: " + perimetro);
        System.out.println("area: " + area);
    }
}
