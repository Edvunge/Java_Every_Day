package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo41a60;

import java.util.Scanner;

public class Exerc60 {
    // 60. Faça um programa que leia vários números, calcule e mostre:
    //       (a) A soma dos números digitados
    //       (b) A quantidade de números digitados
    //       (c) A média dos números digitados
    //       (d) O maior número digitado
    //       (e) O menor número digitado
    //       (f) A média dos números pares
    // Finalize a entrada de dados caso o usuário informe o valor 0.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double somaDosNumersDigitdos = 0.0;
        double quantddDosNumersDigitdos = 0.0;
        double mediaDosNumersDigitdos = 0.0;
        double maxDosNumersDigitdos = 0.0;
        double minDosNumersDigitdos = 0.0;
        double mediaDosnumrsPares = 0.0, somaDosnumrsPares = 0.0;

        System.out.println("Digite um numero qualquer: ");
        int numAleatorio = input.nextInt();

        for (int i = 0; i < numAleatorio; i++) {
            quantddDosNumersDigitdos++;
            somaDosNumersDigitdos += i;

            if(i > maxDosNumersDigitdos) {
                maxDosNumersDigitdos = i;
            } else {
                minDosNumersDigitdos = i;
            }

            if(i % 2 == 0) {
                somaDosnumrsPares += i;
            }
        }

        mediaDosNumersDigitdos = (somaDosNumersDigitdos/numAleatorio);
        mediaDosnumrsPares = (somaDosnumrsPares/numAleatorio);


        System.out.format("\nA quantidade de numeros digitados: %.2g\n",quantddDosNumersDigitdos);
        System.out.format("A media dos numeros digitados: %.2g\n",mediaDosNumersDigitdos);
        System.out.format("O maior numero digitado: %.2g\n",maxDosNumersDigitdos);
        System.out.format("O menor numero digitado: %.2g\n",minDosNumersDigitdos);
        System.out.format("A media dos numeros pares: %.2g\n",mediaDosnumrsPares);
        input.close();
    }
}
