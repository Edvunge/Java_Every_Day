package UdemyCourses.javaComOOP_MatheusBattisti.section04_condicionais;

import java.util.Scanner;

public class Exercicio04_identificacaoDeDiaUtil {
    /*
    Exercicio 4: Identificação de Dia Útil

    Peça ao usuario para inserir um numero de 1 e 7,
    representando os dias de semana (1 para domingo, 2 para segunda, etc.).
    Uma switch para verificar se o dia é um dia útil (segunda a sexta) ou final de semana (sabado e domingo).
    Exiba uma mensagem correpondente.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero entre 1 e 7");
        int diaSemana = input.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA FEIRA");
                break;
            case 3:
                System.out.println("TERÇA FEIRA");
                break;
            case 4:
                System.out.println("QUARTA FEIRA");
                break;
            case 5:
                System.out.println("QUINTA FEIRA");
                break;
            case 6:
                System.out.println("SEXTA FEIRA");
                break;
            case 7:
                System.out.println("SABADO");
                break;
        }
    }
}
