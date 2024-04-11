package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Algoritmo61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quinto, razao, termo;

        System.out.println("digite o 1o termo: ");
        termo = input.nextDouble();

        System.out.println("Digite a razao: ");
        razao = input.nextDouble();

        quinto = termo * razao * 4;
        System.out.println("O 5o termo desta P.G e: " + quinto);
    }
}
