package books.JavaComoProgramar_Deitel_editora.EntradaSaidaOperadores;

import java.util.Scanner;

public class ExercicioGeral {
    public static void main(String[] args){

        /*
 2.3 Escreva instruções para realizar cada uma das tarefas a seguir:
a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
b) Solicite que o usuário insira um inteiro.
c) Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler um valor digitado pelo usuário.
d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.
e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método
System.out.printf e dois especificadores de formato %s.
f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".
*/

        Scanner input = new Scanner(System.in);

        int c;
        System.out.print("introduza um numero inteiro: ");
        c  = input.nextInt();

        int value = c;
        System.out.println(" This is a java program ");
        System.out.println("This is a Java program %s");

        if(c != 7){
            System.out.println("The variable number is not equal to 7");
        }
/*
2.5 Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
a) Declare que um programa calculará o produto de três inteiros.
b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
c) Declare as variáveis x, y, z e result como tipo int.
d) Solicite que o usuário insira o primeiro inteiro.
e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
f) Solicite que o usuário insira o segundo inteiro.
g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
h) Solicite que o usuário insira o terceiro inteiro.
i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result.
*/

        System.out.println("-----------------------------------------------------");
        int number1;
        int x; int number2;
        int y; int number3;
        int z; int result;

        System.out.print("introduza um numero inteiro: ");
        number1 = input.nextInt();
        x = number1;

        System.out.print("introduza um numero inteiro: ");
        number2 = input.nextInt();
        y = number2;

        System.out.print("introduza um numero inteiro: ");
        number3 = input.nextInt();
        z = number3;

        result = x + y + z;
        System.out.println("Product is: " + result);
        System.out.println("-----------------------------------------------------");

        //2.5, elabore um programa completo que calcule e imprima o produto de três inteiros.
        int numberOne;
        System.out.print("introduza o number one integer: ");
        numberOne = input.nextInt();

        int numberTwo;
        System.out.print("introduza o number two integer: ");
        numberTwo = input.nextInt();

        int numberThree;
        System.out.print("introduza o number three integer: ");
        numberThree = input.nextInt();

        int calcProdut = numberOne * numberTwo * numberThree;

        System.out.println("the result produt is: " + calcProdut);
    }
}
