package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo105 {
    public static void main(String[] args) {
        // Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
        // carioca
        // paulista
        // mineiro
        // outros estados

        Scanner input = new Scanner(System.in);
        String sigla;

        System.out.println("\nDigite sigla: ");
        sigla = input.next();

        if (sigla.equals("RJ") || sigla.equals("rj")) {
            System.out.println("\ncarioca");
        } else {
            if (sigla.equals("SP") || sigla.equals("sp")) {
                System.out.println("\npaulista");
            } else {
                if (sigla.equals("MG") || sigla.equals("mg")) {
                    System.out.println("\nmineiro");
                } else {
                    System.out.println("\nOutros estados");
                }
            }
        }
        System.out.println("\n");
        input.close();
    }
}
