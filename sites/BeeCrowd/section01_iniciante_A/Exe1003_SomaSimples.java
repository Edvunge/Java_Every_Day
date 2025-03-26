package sites.BeeCrowd.section01_iniciante_A;

import java.util.Scanner;

public class Exe1003_SomaSimples {
    /*
    Leia dois valores inteiros, no caso para variáveis A e B. A seguir,
    calcule a soma entre elas e atribua à variável SOMA.
    A seguir escrever o valor desta variável.

    Entrada
    O arquivo de entrada contém 2 valores inteiros.

    Saída
    Imprima a mensagem "SOMA" com todas as letras maiúsculas,
    com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
    Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
    caso contrário, você receberá "Presentation Error".
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorA = input.nextInt();

        System.out.println("Digite um outro valor: ");
        int valorB = input.nextInt();

        int soma = valorA + valorB;

        System.out.printf("O valor da soma: %d + %d = %d",valorA ,valorB, soma);
    }
}
