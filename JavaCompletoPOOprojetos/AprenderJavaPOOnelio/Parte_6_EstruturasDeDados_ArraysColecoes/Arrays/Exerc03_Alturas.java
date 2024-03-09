package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_6_EstruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc03_Alturas {
    // Fazer um programa para ler nome, idade, e altura de N pessoas, conforme exemplo.
    // depois, mostrar na tela a altura media das pessoas, e mostrar tabem a percetagem de pessoas de 16 anos.
    // bem como os nomes dessas pessoas caso houver.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media = 0, soma = 0;
        int pessoasDigitadas;

        System.out.println("Quantas pessoas serao digitadas? ");
        pessoasDigitadas = input.nextInt();

        String[] vetNome = new String[pessoasDigitadas];
        int[] vetIdade = new int[pessoasDigitadas];
        double[] vetAltura = new double[pessoasDigitadas];

        for (int j = 0; j < pessoasDigitadas; j++) {
            System.out.println("Dados da %da peassoa: ");

            System.out.print("Nome: ");
            vetNome[j] = input.next();

            System.out.print("Idade: ");
            vetIdade[j] = input.nextInt();

            System.out.print("Altura: ");
            vetAltura[j] = input.nextDouble();
        }

        int nmenores = 0;
        double alturatotal = 0;

        for (int i = 0; i < pessoasDigitadas; i++) {
            if (vetIdade[i] < 16) {
                nmenores++;
            }
            alturatotal = alturatotal + vetAltura[i];
        }

        double alturamedia = alturatotal / pessoasDigitadas;
        double percentualMenores = ((double)nmenores / pessoasDigitadas) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for(int i = 0; i < pessoasDigitadas; i++) {
            if (vetIdade[i] < 16) {
                System.out.printf("%s\n", vetNome[i]);
            }
        }

        media = (soma / pessoasDigitadas);

        System.out.printf("A Altura Media: %.2f" ,media);
        input.close();
    }
}
