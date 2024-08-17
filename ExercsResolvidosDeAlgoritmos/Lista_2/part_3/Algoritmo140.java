package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, L;
        float vc, vcd;

        System.out.println("Digite nome:");
        nome = input.next();

        System.out.println("Digite valor da conta:");
        vc = input.nextFloat();

        L = nome;

        if( L.equals("A") || L.equals("a") || L.equals("D") || L.equals("d") || L.equals("M") || L.equals("m") || L.equals("S")
                || L.equals("s") ) {
            System.out.println( nome + " valor da conta com desconto: R$ " + vc * 0.7);
        } else {
            System.out.println(" Que pena. Nesta semana o desconto não é para seu nome");
        }
    }
}
