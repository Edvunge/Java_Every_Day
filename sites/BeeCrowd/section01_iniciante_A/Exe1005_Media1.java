package sites.BeeCrowd.section01_iniciante_A;

import java.util.Scanner;

public class Exe1005_Media1 {
    /*
    Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
    A seguir, calcule a média do aluno,
    sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
    Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite duas notas: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();

        double media = nota1+nota2/2;
        System.out.printf("A media eh: %.2f",media);
    }
}
