package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempo, vel, dist, litros;

        System.out.println("digite o tempo gasto: ");
        tempo = input.nextDouble();

        System.out.println("digite a velocidade media: ");
        vel = input.nextDouble();

        dist = tempo * vel;
        litros = dist / 12;

        System.out.println("velocidade = " + vel + " tempo, " + tempo + " distancia = " + dist + " litros: " + litros);
    }
}
