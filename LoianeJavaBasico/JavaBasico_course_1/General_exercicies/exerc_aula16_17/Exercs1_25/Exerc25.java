package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc25 {
    //  25. Faça um programa que peça para n pessoas a sua idade, ao final o
    //  programa devera verificar se a média de idade da turma varia entre 0 e
    //  25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
    //  ou idosa, conforme a média calculada.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idades;
        double mediaDeIdades = 0.0, soma = 0.0;

        System.out.println("Digite o numero de pessoas: ");
        int nPessoas = input.nextInt();

        for(int i = 0; i < nPessoas; i++) {
            System.out.println("Digite a sua idade: ");
            idades = input.nextInt();
            soma += idades;
        }

        mediaDeIdades = (soma/nPessoas);
        System.out.println("A media de idades e de: " + mediaDeIdades);

        if (mediaDeIdades >= 0 && mediaDeIdades <= 25) {
            System.out.println("eh jovem!");
        } else if(mediaDeIdades >= 26 && mediaDeIdades <= 60) {
            System.out.println("eh Adulto");
        } else if (mediaDeIdades > 60) {
            System.out.println("eh Idoso");
        }
    }
}
