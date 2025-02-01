package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import java.util.Scanner;

public class ExercicioGeral04 {
    public static void main(String[] args){

        /* estes exercicios foram retirados do livro k9 - logica de programação.
        --------------------------------------------------------------------------------------------- ---------------------------------------------------------------------------------------------
        Execícios
        1. Escreva um programa que contenha duas variáveis: precoDoProduto1 e precoDoProduto2.
        Além disso, o seu programa deverá imprimir na tela a mensagem “O produto X é o mais caro.”,
        substituindo X por 1 quando o valor do precoDoProduto1 for maior que o valor do precoDoProduto2 ou por 2 quando ocorrer o contrário.

        --------------------------------------------------------------------------------------------- ---------------------------------------------------------------------------------------------
        */

        int precoDoProduto1;
        int precoDoProduto2;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza um numero para o preço: ");
        precoDoProduto1  = input.nextInt();

        System.out.print("introduza um outro numero para o preço: ");
        precoDoProduto2  = input.nextInt();

        if (precoDoProduto1 > precoDoProduto2) {
            System.out.println(" o produto é o mais caro. " + precoDoProduto1 );
        } else {
            System.out.println(" o produto é o mais caro. " + precoDoProduto2 );
        }

        /*
        --------------------------------------------------------------------------------------------- ---------------------------------------------------------------------------------------------

        2. Escreva um programa que contenha uma variável:
        horaDoDia. Essa variável deverá conter a hora do dia e três mensagens deverão ser impressas na tela de acordo com a hora:
        “Bom dia”, “Boa tarde” ou “Boa noite”. Não se preocupe em capturar a hora do sistema, insira a hora manualmente em seu programa.

        00h - 11h ( bom dia )
        12h - 17h ( boa tarde )
        18h - 23h ( boa noite )
        --------------------------------------------------------------------------------------------- ---------------------------------------------------------------------------------------------
        */

        int horaDoDia;

        /* Scanner input = new Scanner(System.in); */

        System.out.print(" Que horas são: ");
        horaDoDia  = input.nextInt();

        if( horaDoDia >= 00 &&  horaDoDia <= 11 ){
            System.out.println(" Bom dia. ");
        } else if ( horaDoDia >= 12 &&  horaDoDia <= 17 ){
            System.out.println(" Boa tarde. ");
        } else {
            System.out.println(" Boa noite. ");
        }
    }
}
