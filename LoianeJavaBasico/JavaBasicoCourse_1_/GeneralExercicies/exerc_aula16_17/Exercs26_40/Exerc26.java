package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17.Exercs26_40;

import java.util.Scanner;

public class Exerc26 {
    //  26. Numa eleição existem três candidatos. Faça um programa que peça o
    //  número total de eleitores. Peça para cada eleitor votar e ao final
    //  mostrar o número de votos de cada candidato.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numDeEleitores, voto;
        int candidato_A = 0, candidato_B = 0, candidato_C = 0;

        System.out.println("Digite o numero total de eleitores: ");
        numDeEleitores = input.nextInt();

        for (int i = 0; i < numDeEleitores; i++) {
            System.out.println("Em Qual candidato pretende votar: \n " +
                    "Para votar candidato_A: pressione (1) \n " +
                    "Para votar candidato_B: pressione (2) \n " +
                    "Para votar candidato_C: pressione (3) \n ");
            voto = input.nextInt();

            if (voto == 1) {
                candidato_A++;
            } else if (voto == 2) {
                candidato_B++;
            } else if (voto == 3) {
                candidato_C++;
            }
        }

        System.out.println("******************************************************");
        System.out.println("============ RESULTADO DAS ELEICOES  ================");
        System.out.println("******************************************************");

        if (candidato_A > candidato_B && candidato_A > candidato_C) {
            System.out.printf(" O candidato_A obteve (%d - votos) eh o grande vencedor desta Eleicao. \n ", candidato_A);
            System.out.printf(" O candidato_B obteve (%d - votos) segundo lugar eh seu nesta Eleicao.\n ", candidato_B);
            System.out.printf(" O candidato_C obteve (%d - votos) ooohh que pena ficaste em Ultimo.\n ", candidato_C);
        } else if (candidato_B > candidato_A && candidato_B > candidato_C) {
            System.out.printf(" O candidato_B obteve (%d - votos) eh o grande vencedor desta Eleicao. \n ", candidato_B);
            System.out.printf(" O candidato_A obteve (%d - votos) segundo lugar eh seu nesta Eleicao.\n ", candidato_A);
            System.out.printf(" O candidato_C obteve (%d - votos) ooohh que pena ficaste em Ultimo.\n ", candidato_C);
        } else {
            System.out.printf(" O candidato_C obteve (%d - votos) eh o grande vencedor desta Eleicao. \n ", candidato_C);
            System.out.printf(" O candidato_A obteve (%d - votos) segundo lugar eh seu nesta Eleicao.\n ", candidato_A);
            System.out.printf(" O candidato_B obteve (%d - votos) ooohh que pena ficaste em Ultimo.\n ", candidato_B);
        }

        System.out.println("******************************************************");
        input.close();
    }
}
