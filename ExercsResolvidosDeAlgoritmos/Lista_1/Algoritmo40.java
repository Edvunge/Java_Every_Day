package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo40 {
    public static void main(String[] args) {
        // Entrar como dois numeros inteiros e imprimir a seguinte
        // Dividendo:
        // Divisor:
        // Quociente:
        // Resto:
        Scanner input = new Scanner(System.in);

        double num1, num2, quoc, resto;

        System.out.println("digite o divisor: ");
        num1 = input.nextDouble();

        System.out.println("digite o dividendo: ");
        num2 = input.nextDouble();

        quoc = num1 / num2;
        resto = num1 % num2;

        System.out.println("o divisor: " + num1);
        System.out.println("o dividendo: " + num2);
        System.out.println("o quociente: " + quoc);
        System.out.println("o resto: " + resto);
        System.out.println(" ");
    }
}
