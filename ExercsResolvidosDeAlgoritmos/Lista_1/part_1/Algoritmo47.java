package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo47 {
    public static void main(String[] args) {
        // Entrar com um numero no formato CDU e imprimir invertido:
        // UDC o numero devera ser armazedo em outra varivel antes de ser impresso.
        Scanner input = new Scanner(System.in);
        int num, c, d, u, num1;

        System.out.println("entre com um numero de 3 digitos: ");
        num = input.nextInt();

        c = num / 100;
        d = num % 100 / 10;
        u = num % 10;
        num1 = u*100 + d*10 + c;

        System.out.println("numero: " + num);
        System.out.println("numero: " + num1);
    }
}
