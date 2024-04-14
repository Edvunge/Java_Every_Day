package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import java.util.Scanner;

public class ExercicioGeral02 {

    public static void main(String[] args){
        /*
           Questões

 2.14 Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço.
 Use as seguintes técnicas:
a) Uma instrução System.out.println.
b) Quatro instruções System.out.print.
c) Uma instrução System.out.printf.
    */
        System.out.println("1 2 3 4");
        System.out.print("2 2");
        System.out.print(" 3 3");
        System.out.print(" 4 4");
        System.out.printf(" .");

        System.out.println("\n");

        /*33
2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros,
obtenha dele esses números e imprima sua soma,
produto, diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
*/
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza um numero inteiro: ");
        number1  = input.nextInt();

        System.out.print("introduza um outro numero inteiro: ");
        number2  = input.nextInt();

        int soma = ( number1 + number2 );
        int produto = ( number1 * number2 );
        int subtracao = ( number1 - number2 );
        double quociente = ( number1 / number2 );

        System.out.printf(" a soma de %d por %d é igual a %d \n", number1 ,number2, soma );
        System.out.printf(" o produto de %d por %d é igual a %d \n", number1 ,number2, produto );
        System.out.printf(" a subtração de %d por %d é igual a %d \n", number1 ,number2, subtracao );
        System.out.printf(" já a divisão de %d por %d é igual a %s \n", number1 ,number2, quociente );

/*
2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
maior seguido pelas palavras “is larger".
Se os números forem iguais, imprima a mensagem “These numbers are equal".
Utilize as técnicas mostradas na Figura 2.15.
*/
        System.out.printf("\n");


        int number3;
        int number4;

        Scanner entrada = new Scanner(System.in);

        System.out.print("introduza um numero inteiro: ");
        number3  = entrada.nextInt();

        System.out.print("introduza um outro numero inteiro: ");
        number4  = entrada.nextInt();

        if (number3 > number4 || number4 > number3) {
            System.out.printf(" is larger");
        } else {
            System.out.println(" These numbers are equal ");
        }
        System.out.printf("\n");


/*
2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e
exiba a soma, média, produto e os números menores e maiores. Utilize as técnicas mostradas na Figura 2.15.
[Observação: o cálculo da média neste exercício deve resultar em uma representação de inteiro.
Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
*/
        System.out.printf("\n");

        int number5;
        int number6;
        int number7;

        Scanner entrad = new Scanner(System.in);

        System.out.print("introduza um número inteiro: ");
        number5  = entrad.nextInt();

        System.out.print("introduza um segundo número inteiro: ");
        number6  = entrad.nextInt();

        System.out.print("introduza um outro número inteiro: ");
        number7  = entrad.nextInt();

        int somma = ( number5 + number6 + number7 );
        System.out.println("o valor da somma é " + somma);

        /*
        para ter a media a condição:
        era receber valores da media em double e converter para inteiro
        Converti usando Type Casting como podemos verificar abaixo.
         */
        double mmedia = ( (number5 + number6 + number7) / 3 );
        int i_val = (int) mmedia;
        System.out.println("o valor da media é " + mmedia);


        int prodduto = ( number5 * number6 * number7 );
        System.out.println("o valor do prodduto é " + prodduto);


        if (number5 > number6 || number5 > number7) {
            System.out.printf(" %d is larger " , number5);
        } else if (number6 > number5 || number6 > number7) {
            System.out.printf(" %d is larger ", number6);
        } else if (number7 > number5 || number7 > number6) {
            System.out.printf(" %d is larger ", number7);
        } else {
            System.out.println(" These numbers are equal ");
        }



/*
2.18 (Exibindo formas com asteriscos) Escreva um aplicativo que exiba uma caixa, uma elipse,
uma seta e um losango utilizando asteriscos (*), como segue:
*/
        // CAIXA
        System.out.printf("------------------------");
        System.out.printf("%n");
        System.out.printf("* * * * * * *%n*           *%n*           *%n*           *%n* * * * * * *%n");

        // ELIPSE
        System.out.printf("------------------------");
        System.out.printf("%n");
        System.out.printf("    * * *  %n *        *%n*          *%n*          *%n*          *%n *        * %n   * * * %n");


        // SETA
        System.out.printf("------------------------");
        System.out.printf("%n");
        System.out.printf("       *%n      ****%n     ******%n       *%n       *%n       *%n       *%n       *");

        // LOSANGO
        System.out.printf("%n");
        System.out.printf("------------------------");
        System.out.printf("%n");
        System.out.printf("        *%n       *  *%n     *      *%n    *         *%n   *            *%n   *            *%n     *         *%n       *     *%n          *%n");


    }
}