package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo57 {
    public static void main(String[] args) {
        // Entrar com notas da PR1 e PR2 e imprimir a media final:
        // truncada:
        // arredondada:
        Scanner input = new Scanner(System.in);

        double pr1, pr2, mf;

        System.out.println("digite pr1: ");
        pr1 = input.nextDouble();

        System.out.println("digite pr2: ");
        pr2 = input.nextDouble();

        mf = (pr1 + pr2) / 2;
        System.out.println("media truncada = " + (int)( (mf - 0.5) + 0.001));
        System.out.println("media arredondada = " + (int)(mf + 0.001));
        input.close();
    }
}
