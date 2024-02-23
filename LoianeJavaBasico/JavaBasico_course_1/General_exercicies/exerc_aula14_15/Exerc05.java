package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula14_15;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        /*
        5. Faça um programa para a leitura de duas notas parciais de um aluno.
        O programa deve calcular a média alcançada por aluno e apresentar:
        o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        o A mensagem "Reprovado", se a média for menor do que sete;
        o A mensagem "Aprovado com Distinção", se a média for igual a dez.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1+nota2)/2;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if(media < 7) {
            System.out.println("Reprovado");
        } else if(media == 10) {
            System.out.println("APROVADO COM DESTINÇAO");
        }
        input.close();
    }
}
