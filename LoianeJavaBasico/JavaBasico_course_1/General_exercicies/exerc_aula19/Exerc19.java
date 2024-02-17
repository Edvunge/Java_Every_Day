package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc19 {
    public static void main(String[] args) {
        /*
            19.Ler as duas notas bimestrais para um conjunto de 10 alunos.
            Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real.
            Escreva um programa que calcule a média aritmética simples
            das notas informadas armazenando o resultado em um vetor “Result”
            de mesmo tipo e tamanho.
            Ao mostrar os resultados exibir a situação de cada aluno.
            Se a média calculada for superior ou igual a 7 o aluno
            estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.
        */

        // mediaAritmetica das notas = result
        //
        int estudantes = 10;
        final int lengthARRAY = 10;
        int vetNota1[] = {2, 3, 9, 10, 8, 4, 9, 5, 0, 6};
        int vetNota2[] = {12, 13, 9, 12, 8, 14, 9, 5, 10, 6};
        double result[] = new double[lengthARRAY];

        for (int j = 0; j < lengthARRAY; j++) {
            // Calcula a média de cada aluno
            result[j] = (vetNota1[j] + vetNota2[j]) / 2.0;

            // Exibe a situação de cada aluno
            if (result[j] >= 7) {
                System.out.printf("\nAluno " + (j + 1) + " aprovado, Media do aluno: %.1f",result[j]);
            } else {
                System.out.printf("\nAluno " + (j + 1) + " reprovado, Media do aluno: %.1f",result[j]);
            }
        }
    }
}
