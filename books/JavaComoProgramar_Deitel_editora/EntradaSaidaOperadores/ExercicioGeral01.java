package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;


import java.util.Scanner;

public class ExercicioGeral01 {
    public static  void main(String[] args){
        /*
           Questões
2.32 Escreva um programa que insira cinco números,
além de determinar e imprimir quantos negativos, quantos positivos e quantos zeros foram inseridos.
*/
        Scanner input = new Scanner(System.in);

        int number1;
        int number2; int number3;
        int number4; int number5;

        System.out.print("introduza o primeiro numero inteiro: ");
        number1 = input.nextInt();

        System.out.print("introduza o segundo numero inteiro: ");
        number2 = input.nextInt();

        System.out.print("introduza o terceiro numero inteiro: ");
        number3 = input.nextInt();

        System.out.print("introduza o quarto numero inteiro: ");
        number4 = input.nextInt();

        System.out.print("introduza o quinto numero inteiro: ");
        number5 = input.nextInt();

        // calculo dos numeros negativos
        if(number1 < 0 ){
            System.out.println("numero negativo: " + number1);
        } else if (number2 < 0){
            System.out.println("numero negativo: " + number2);
        } else if (number3 < 0){
            System.out.println("numero negativo: " + number3);
        } else if (number4 < 0){
            System.out.println("numero negativo: " + number4);
        } else if (number5 < 0){
            System.out.println("numero negativo: " + number5);
        }

        // calculo dos numeros positivos
        if(number1 > 0 ){
            System.out.println("numero positivo: " + number1);
        }else if (number2 > 0){
            System.out.println("numero positivo: " + number2);
        } else if (number3 > 0){
            System.out.println("numero positivo: " + number3);
        } else if (number4 > 0){
            System.out.println("numero positivo: " + number4);
        } else if (number5 > 0){
            System.out.println("numero positivo: " + number5);
        }

        // calculo dos numeros iguais a zeros
        if(number1 == 0 ){
            System.out.println("numero " + number1 +  " igual a zero: ");
        } else if (number2 == 0){
            System.out.println("numero " + number2 +  " igual a zero: ");
        } else if (number3 == 0){
            System.out.println("numero " + number3 +  " igual a zero: ");
        } else if (number4 == 0){
            System.out.println("numero " + number4 +  " igual a zero: ");
        } else if (number5 == 0){
            System.out.println("numero " + number5 +  " igual a zero: ");
        }

        System.out.println("==================================================");

/*
Fazendo a diferença
2.33 (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC)
no Exercício 1.10. As fórmulas para calcular o IMC são
IMC =
ou
pesoEmLibras × 703 alturaEmPolegadas2
pesoEmQuilogramas alturaEmMetros2
 IMC =
 Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogra- mas e a altura em metros)
 e, então, calcule e exiba o índice de massa corporal dele.

 Além disso, que exiba as seguintes informações do De- partment of Health and Human Services/National Institutes of Health,
 assim o usuário pode avaliar o seu IMC:
[Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros.
Os cálculos de IMC, quando feitos com valores int, produzirão resultados com números inteiros.
No Capítulo 3, você aprenderá a utilizar o tipo double para representar números com pontos decimais.
Quando os cálculos de IMC são realizados com doubles, eles produzirão números com pontos decimais — esses são chamados de números de “ponto flutuante”.]

IMC = pesoEmLibras * 703 / ( alturaEmPolegadas * alturaEmPolegadas );

BMI VALUES
Underweight:     less than 18.5
Normal:   between 18.5 and 24.9
Overweight: between 25 and 29.9
Obese: 30 or greater

*/
        // secção de declaração de variaveis.
        Double pesoEmLibras;
        Double alturaEmPolegadas;
        Double IMC;


        // secção de leitura pelo teclado pelo usuario.
        System.out.print("introduza o peso em libras: ");
        pesoEmLibras = input.nextDouble();

        System.out.print("introduza o altura em polegdas: ");
        alturaEmPolegadas = input.nextDouble();

        // secção da formula do IMC
        IMC = ( ( pesoEmLibras * 703 )  /  ( alturaEmPolegadas * alturaEmPolegadas ) );

        System.out.println("the result is: " + IMC);

        // secção de do ciclo de repetição.
        if( IMC > 18.5){
            System.out.println("you are Underweight sorry! ");
        } else if ( IMC > 18.5 && IMC  > 24.9){
            System.out.println("you are Normal sorry! ");
        } else if (IMC > 25 &&  IMC > 29.9 ){
            System.out.println("you are Overweight sorry! ");
        } else {
            System.out.println("you are OBESE sorry! ");
        }

        System.out.println("==================================================");

 /*
2.34 Utilize a internet para descobrir a população mundial atual e a taxa de crescimento demográfico mundial anual.
Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada depois de um, dois, três, quatro e cinco anos.


2.35 (Calculadora de economia da faixa solidária) Pesquise vários sites sobre faixa solidária.
Crie um aplicativo que calcule o custo diário de dirigir, para estimar quanto dinheiro pode ser economizado com o uso da faixa solidária,
que também tem outras vantagens, como reduzir emissões de carbono e congestionamento de tráfego.
O aplicativo deve introduzir as seguintes informações e exibir o custo por dia de dirigir para o trabalho do usuário:
a) Quilômetros totais dirigidos por dia. b) Preço por litro de gasolina.
c) Quilômetros médios por litro.
d) Taxas de estacionamento por dia. e) Pedágio por dia.
*/

    }
}
