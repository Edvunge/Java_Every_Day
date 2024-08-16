package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo139 {
    public static void main(String[] args) {
        /* algoritmo 139
        Sabendo que somente os municípios que possuem mais de 20.000 eleitores aptos
        têm segundo turno nas eleições para prefeito caso o primeiro colocado não
        tenha mais do que 50% dos votos, fazer um algoritmo que leia o nome do município,
                a quantidade de eleitores aptos, o número de votos do candidato mais votado
        e informar se ele terá ou não segundo turno em sua eleição municipal.
        */
        Scanner input = new Scanner(System.in);

        int ne, votos;
        String nome;

        System.out.println("Digite nome do Municipio:");
        nome = input.next();

        System.out.println("numero de eleitores aptos:");
        ne = input.nextInt();

        System.out.println("numero de votos do candidato mais votado: H");
        votos = input.nextInt();

        if (ne > 20000 && votos <= ne / 2) {
            System.out.println(nome + " terá segundo turno");
        } else {
            System.out.println(nome + " nao terá segundo turno");
        }
        System.out.println(" ");
    }
}
