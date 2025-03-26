package sites.BeeCrowd.section01_iniciante_A;

import java.util.Scanner;

public class Exe1001_ExtremamenteBasico {
    /*
    Leia 2 valores inteiros e armazene-os nas variáveis A e B.
    Efetue a soma de A e B atribuindo o seu resultado na variável X.
    Imprima X conforme exemplo apresentado abaixo.

    Não apresente mensagem alguma além daquilo que está sendo especificado e
    não esqueça de imprimir o fim de linha após o resultado,
    caso contrário, você receberá "Presentation Error".

    Entrada
    A entrada contém 2 valores inteiros.

    Saída
    Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
    Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valueA = input.nextInt();

        System.out.println("Digite um outro valor: ");
        int valueB = input.nextInt();

        int valueX = valueA + valueB;
        System.out.println("A soma é igual a: " + valueX);
    }
}
