package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo138 {
    // algoritmo 138

    //  Ler um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o
    //  usuário digite um número fora desse intervalo, deverá aparecer uma mensagem
    //  informando que não existe mês com este número.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero entre 1 a 12: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("MES 1. JANEIRO");
                break;
            case 2:
                System.out.println("MES 2. FEVEREIRO");
                break;
            case 3:
                System.out.println("MES 3. MARCO");
                break;
            case 4:
                System.out.println("MES 4. ABRIL");
                break;
            case 5:
                System.out.println("MES 5. MAIO");
                break;
            case 6:
                System.out.println("MES 6. JUNHO");
                break;
            case 7:
                System.out.println("MES 7. JULHO");
                break;
            case 8:
                System.out.println("MES 8. AGOSTO");
                break;
            case 9:
                System.out.println("MES 9. SETEMBRO");
                break;
            case 10:
                System.out.println("MES 10. OUTUBRO");
                break;
            case 11:
                System.out.println("MES 11. NOVEMBRO");
                break;
            case 12:
                System.out.println("MES 12. DEZEMBRO");
                break;
            default:
                System.out.println("NUMERO INVALIDO!");
        }
        input.close();
    }
}
