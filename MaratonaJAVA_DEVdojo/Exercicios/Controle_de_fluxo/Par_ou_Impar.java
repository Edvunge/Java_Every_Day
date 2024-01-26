package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Scanner;

public class Par_ou_Impar {
    // Par ou Ímpar:
    //Solicite um número ao usuário e determine se é par ou ímpar.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("eh Par");
        } else {
            System.out.println("eh IMPar");
        }
        sc.close();
    }
}
