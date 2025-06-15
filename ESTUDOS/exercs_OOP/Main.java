package ESTUDOS.exercs_OOP;

import java.util.Scanner;

public class Main {
    // Crie um programa que leia o nome de uma pessoa e diga se ela tem o nome "SILVA".
    public String name;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = new String();

        System.out.println("Digite o seu nome: ");
        name = input.next();

        if(name.contains("silva")){
            System.out.println("O seu nome tem o nome 'silva'");
        } else {
            System.out.println("Nome digitado: " + name + " no seu nome não tem o nome 'silva' ");
        }
        //System.out.println("Nome digitado: " + name);
    }
}
