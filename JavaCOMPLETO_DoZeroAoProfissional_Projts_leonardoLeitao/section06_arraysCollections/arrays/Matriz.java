package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section06_arraysCollections.arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("quantos alunos? ");
        int qtAlunos = input.nextInt();

        System.out.println("quantas notas por aluno? ");
        int qtdNotas = input.nextInt();

        double[][] notasDaTurma = new double[qtAlunos][qtdNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf(" informe a nota %d do aluno %d: ",n , a);
                notasDaTurma[a][n] = input.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtAlunos * qtdNotas);
        System.out.println("Media da turma e " + media);

        input.close();
    }
}
