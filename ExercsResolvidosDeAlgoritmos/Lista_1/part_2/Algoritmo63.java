package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;


import java.util.Scanner;

public class Algoritmo63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int na;
        double vha, pd, td, sb, sl;

        System.out.println("digite as horas trabalhadas: ");
        na = input.nextInt();

        System.out.println("valor da hora-aula: ");
        vha = input.nextInt();

        System.out.println("percentual de desconto: ");
        pd = input.nextDouble();

        sb = na * vha;
        td = (pd / 100) * sb;
        sl = sb - td;
        System.out.println("salario liquido: " + sl);
    }
}
