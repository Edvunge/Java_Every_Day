package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc04_NotasBimestrais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a sua primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a sua segundo nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.println("Digite a sua quarta nota: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("O resultado da media eh: " + media);
        sc.close();
    }
}
