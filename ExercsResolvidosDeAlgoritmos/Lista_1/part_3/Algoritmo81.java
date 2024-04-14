package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int conta, inv, digito, d1, d2, d3, soma;

        System.out.println("digite conta de tres digitos: ");
        conta = input.nextInt();

        d1 = conta / 100;
        d2 = conta % 100 / 10;
        d3 = conta % 100 % 10;
        inv = d3 * 100 + d2 * 10 + d1;
        soma = conta * inv;

        d1 = (soma / 100) * 1;
        d2 = (soma % 100 / 10) * 2;
        d3 = (soma % 100 % 10) * 3;
        digito = ( d1 + d2 + d3 ) % 10;
        System.out.println("digito verificador: " + digito);
        input.close();
    }
}
