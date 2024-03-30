package books.fundamentosDeJava.ficha1_exercs;

import java.util.Scanner;

public class Exerc03 {
    //  3 - Crie um programa que receba três nomes quaisquer, por meio da linha de execução
    //  do programa, e que os imprima na tela da seguinte maneira: o primeiro e o último nome
    //  serão impressos na primeira linha um após o outro, o outro nome ( o segundo) será
    //  impresso na segunda linha, tudo no mesmo comando.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o seu nome completo, da primeira pessoa: ");
        String nome1 = input.next();

        System.out.println("digite o seu nome completo, da segunda pessoa: ");
        String nome2 = input.nextLine();

        System.out.print("digite o seu nome completo, da terceira pessoa: ");
        String nome3 = input.next();

        System.out.printf(" %s %s \n %s",nome1 ,nome2 ,nome3);
        input.close();
    }
}
