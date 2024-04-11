package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sm, qtdade, preco, vp, vd;

        System.out.println("entre com o valor salrio minimo: ");
        sm = input.nextDouble();

        System.out.println("entre com a quantidade em quilowatt: ");
        qtdade = input.nextDouble();

        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;

        System.out.println(" preco do quilowatt: " + preco + " valor a ser pago: " + vp + " valor com desconto: " + vd);
    }
}
