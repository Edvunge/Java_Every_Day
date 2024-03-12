package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

import java.util.Scanner;

public class Exerc95 {
    //  95. Para uma turma de 45 alunos, construa um algoritmo que determine:
    //  a) A idade média dos alunos com menos de 1,70m de altura;
    //  b) A altura média dos alunos com mais de 20 anos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0.0, idadeMediaDosMenoresDe1e70 = 0.0;
        double altura = 0.0, alturaMediaAlunosMais20Anos = 0.0;
        int idade = 0, alunos = 45;
        double alturaMedia = 0.0;

        for(int i = 0; i < alunos; i++) {

            System.out.println("Digite a tua idade: ");
            idade = input.nextInt();

            System.out.println("Digite a sua altura: ");
            altura = input.nextDouble();

            if (altura < 1.70) {
                soma += idade;
            }

            if (idade > 20) {
                alturaMedia += altura;
            }
        }
        idadeMediaDosMenoresDe1e70 = (soma / alunos);
        alturaMediaAlunosMais20Anos = (alturaMedia / alunos);

        System.out.printf("Idade Media Dos Menores De 1.70: %.2g\n",idadeMediaDosMenoresDe1e70);
        System.out.printf("Altura Media Alunos Mais 20 Anos: %.2g\n",alturaMediaAlunosMais20Anos);
        input.close();
    }
}
