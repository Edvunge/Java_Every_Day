package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula14_15;

import java.util.Scanner;

public class Exerc03_Vogal_OU_Consoante {
    // 4. Faça um Programa que verifique se uma letra digitada é vogal ou
    //consoante.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = sc.next();

        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("\na Letra  eh uma VOGAL");
        } else {
            System.out.println("\na Letra  eh uma CONSOANTE");
        }
        sc.close();
    }
}