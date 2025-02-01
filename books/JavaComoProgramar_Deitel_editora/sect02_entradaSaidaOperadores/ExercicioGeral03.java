package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import java.util.Scanner;

public class ExercicioGeral03 {
    public static void main(String[] args){



        /*
       Questões

2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros,
além de determinar e imprimir o maior e o menor inteiro no grupo.
Utilize somente as técnicas de programação que você aprendeu neste capítulo.

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza um numero: ");
        number1  = input.nextInt();

        System.out.print("introduza um outro numero: ");
        number2  = input.nextInt();

        System.out.print("introduza um numero: ");
        number3  = input.nextInt();

        System.out.print("introduza um outro numero: ");
        number4  = input.nextInt();

        System.out.print("introduza um outro numero: ");
        number5  = input.nextInt();

         busca o maior numero.
        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){
            System.out.println(" é o maior " + number1 );
        } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5){
            System.out.println(" é o maior " + number2 );
        } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5){
            System.out.println(" é o maior " + number3 );
        } else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5){
            System.out.println(" é o maior " + number4 );
        } else if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4){
            System.out.println("  é o maior " + number5 );
        } else {
            System.out.println(" são iguais. ");
        }

        System.out.printf("\n\n\n");

         busca o menor numero.
        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){
            System.out.printf("%d é o menor",number1 );
        } else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5){
            System.out.printf("%d é o menor",number2 );
        } else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5){
            System.out.printf("%d é o menor",number3 );
        } else if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5){
            System.out.printf("%d é o menor",number4 );
        } else if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
            System.out.printf("%d é o menor",number5 );
        } else {
            System.out.println(" são iguais. ");
        }
        */


  /*
2.25 (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par.
[Dica: utilize o operador de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza um numero inteiro: ");
        number  = input.nextInt();

        if (number %2 == 0){
            System.out.printf("%d o numero: é PAR ", number);
        } else {
            System.out.printf("%d o numero: é IMPAR ", number);
        }
        */

        /*
2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e
imprimir o resul- tado.
[Dica: utilize o operador de resto.]
*/

        int number6;
        int number7;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza um numero inteiro: ");
        number6  = input.nextInt();

        System.out.print("introduza um outro numero inteiro: ");
        number7  = input.nextInt();

        double restoDiv = ( number6 / number7 );

        if ( restoDiv %3 == 0 ){
            System.out.println("São numeros multiplos:");
        } else {
            System.out.printf(" não são números multiplos ");
        }

/*
2.28 (Diâmetro, circunferência e área de um círculo) Eis uma prévia do que veremos mais adiante.
Neste capítulo, você aprendeu sobre inteiros e o tipo int.
O Java também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159.
Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para  .
Utilize as técnicas mostradas na Figura 2.7. [Observação: você também pode empregar a constante Math.PI predefinida para o valor de  .
Essa constante é mais precisa que o valor 3,14159. A classe Math é definida no pacote java.lang.
As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar a classe Math para utilizá-la.]
Adote as seguintes fórmulas (r é o raio):
diâmetro = 2r circunferência = 2 r área =  r2
Não armazene os resultados de cada cálculo em uma variável.
Em vez disso, especifique cada cálculo como o valor de saída em uma instrução System.out.printf.
Os valores produzidos pelos cálculos de circunferência e área são números de ponto flutuante.
A saída desses valores pode ser gerada com o especificador de formato %f em uma instrução System.out.printf.
Você aprenderá mais sobre números de pontos flutuantes no Capítulo 3.


2.29 (O valor inteiro de um caractere) Eis outra prévia do que virá adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo int.
O Java também pode representar letras maiúsculas, minúsculas e uma variedade considerável de símbolos especiais.
Cada caractere tem uma representação correspondente de inteiro.
O conjunto de caracteres que um computador utiliza com as respectivas representações na forma de inteiro desses caracteres é
chamado de conjunto de caracteres desse computador.


Você pode indicar um valor de caractere em um programa simplesmente incluindo esse caractere entre aspas simples, como em ‘A'.
Você pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em (int) 'A'
Um operador dessa forma é chamado operador de coerção. (Você aprenderá sobre os operadores de coerção no Capítulo 4.)
A instrução a seguir gera saída de um caractere e seu equivalente de inteiro:
System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
Quando a instrução precedente executa, ela exibe o caractere A e o valor 65 (do conjunto de caracteres Unicode®) como parte da string.
O especificador de formato %c é um espaço reservado para um caractere (nesse caso, ‘A').
Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício,
escreva um aplicativo que exiba os equivalentes inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais.
Mostre os equivalentes inteiros do seguinte: A B C a b c 0 1 2 $ * + / e o caractere em branco.


2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços.
Por exemplo, se o usuário digitar o número 42339, o programa deve imprimir
42339
Suponha que o usuário insira o número correto de dígitos.
O que acontece quando você insere um número com mais de cinco dígitos?
O que acontece quando você insere um número com menos de cinco dígitos? [Dica: é possível fazer este exercício com as técnicas que aprendeu neste capítulo.
Você precisará tanto das operações de divisão como das de resto para “selecionar” cada dígito.]


2.31 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo,
escreva um aplicativo que calcule os quadrados e cubos dos números de 0 a 10
e imprima os valores resultantes em formato de tabela como a seguir:

*/
    }
}
