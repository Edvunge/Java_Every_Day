package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Algoritmo60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dec, razao, termo;

        System.out.println("Entrar com o 1o termo: ");
        termo = input.nextDouble();

        System.out.println("Entrar com a razao: ");
        razao = input.nextDouble();

        dec = termo + 9*razao;

        System.out.println("O 10 termo desta P.A e: " + dec);
    }
}
