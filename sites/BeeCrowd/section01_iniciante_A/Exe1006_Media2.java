package sites.BeeCrowd.section01_iniciante_A;

import java.util.Scanner;

public class Exe1006_Media2 {
    /*

    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
    A seguir, calcule a média do aluno,
    sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
    Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 valores das notas: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();

        double media = nota1 + nota2 + nota3/3;
        System.out.printf("A media de: %.1f, %.1f, %.1f eh igual %.1f",nota1 ,nota2 ,nota3 ,media);
    }
}
