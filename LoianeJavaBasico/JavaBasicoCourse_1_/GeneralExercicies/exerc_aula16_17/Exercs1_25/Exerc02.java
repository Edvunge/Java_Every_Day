package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc02 {
    /*
    2. Faça um programa que leia um nome de usuário e a sua senha e não
    aceite a senha igual ao nome do usuário, mostrando uma mensagem
    de erro e voltando a pedir as informações.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeDeUsuario;
        String passWord;

        do {
            System.out.println("Digite o nome do usuario: ");
            nomeDeUsuario = input.next();

            System.out.println("Digite a sua palavra Passe: ");
            passWord = input.next();

            if(nomeDeUsuario.equalsIgnoreCase(passWord)){
                System.out.println("palavra passe e o nome de utilizador nao podem ser iguais");
            } else {
                System.out.println("\n######| ACESSO PERMITIDO |######");
            }
        } while (nomeDeUsuario.equalsIgnoreCase(passWord));
        input.close();
    }
}
