package ZEDlistaDEexercicios.NiumaAulas.aula01;



import java.util.Scanner;
import static java.lang.System.exit;
import java.util.*;

public class Exerc01 {
    // 47. Faca um programa que apresente um menu de opcoes para
    // o calculo das seguintes

    // operacoes entre dois numeros:

    // adicao (opcao 1)
    // subtracao (opcao 2)
    // multiplicacao (opcao 3)
    // divisao (opcao 4).
    // saıda (opcao 5)

    //  O programa deve possibilitar ao usuario a
    //  escolha da operacao desejada, a exibicao do
    //  resultado e a volta ao menu de opcoes.
    //  O programa so termina quando for escolhida a
    //  opcao de saıda (opcao 5).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 3;

        do {
            System.out.println("digite uma opcao: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("opcao 1");
                    break;
                case 2:
                    System.out.println("opcao 2");
                    break;
                case 3:
                    System.out.println("opcao 3");
                    break;
                case 4:
                    System.out.println("opcao 4");
                    break;
                case 5:
                    System.out.println("opcao 5 - saida");
                    exit(0);
            }
        } while (option != 5);
        /*
        sempre que estamos diante de estruturas condicionas,
        estamos diante de  
        * */
        input.close();
    }
}
