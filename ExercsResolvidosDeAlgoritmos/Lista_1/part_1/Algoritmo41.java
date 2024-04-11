package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo41 {
    public static void main(String[] args) {
        // Entrar com quatro numeros e imprimir a media ponderada, sabendo-se que
        // os pesos sao resctivamente: 1, 2, 3 e 4;
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, num4, mediaPonderada;

        System.out.println("Entre com 1 numero: ");
        num1 = input.nextDouble();

        System.out.println("Entre com 1 numero: ");
        num2 = input.nextDouble();

        System.out.println("Entre com 1 numero: ");
        num3 = input.nextDouble();

        System.out.println("Entre com 1 numero: ");
        num4 = input.nextDouble();

        mediaPonderada = (num1*1 + num2*2 + num3*3 + num4*4)/10;
        System.out.println("media ponderada: " + mediaPonderada);
    }
}
