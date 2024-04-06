package ZEDlistaDEexercicios.NiumaAulas.aula01;

import java.sql.Array;
import java.util.Scanner;

public class Exerc03 {
    // 3. Construa uma programa em java que armazene 15 números em um vetor e imprima
    // uma listagem numerada contendo o número e uma das mensagens: par ou ímpar.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numers = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 ,11 ,12, 13, 14, 15};
        //int[] nomeQueVoceQuiser = new int[15];

        for (int i = 0; i < 15; i++) {
            if (numers[i] % 2 == 0) {
                System.out.println("Pares:");
                System.out.println(numers[i]);
            } else {
                System.out.println("imPares:");
                System.out.println(numers[i]);
            }
        }
        input.close();
    }
}
