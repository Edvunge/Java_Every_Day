package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Scanner;

public class Verificacao_Da_Idade {
    // Verificação de Idade:
    //Solicite a idade do usuário e determine se ele é menor de idade, maior de idade ou idoso.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade > 18 && idade < 66) {
            System.out.println(" eh maior de idade\n");
        } else if(idade < 18) {
            System.out.println(" eh menor de idade\n");
        } else if(idade > 68 ) {
            System.out.println(" eh idoso\n");
        }
        sc.close();
    }
}