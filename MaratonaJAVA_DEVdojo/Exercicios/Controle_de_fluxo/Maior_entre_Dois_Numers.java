package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Scanner;

public class Maior_entre_Dois_Numers {
    // Maior entre Dois Números:
    //Peça dois números ao usuário e informe qual é o maior.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num1 = sc.nextInt();

        if(num1 > num) {
            System.out.println(num1 + " eh o maior numero");
        } else {
            System.out.println(num + " eh o maior numero");
        }
        sc.close();
    }
}
