package Mini_Projects.conversorGeral.test;

import Mini_Projects.conversorGeral.dominio.ConversorDeMoedas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class appConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();

        conversorDeMoedas.notasEuros = 2.3;
        conversorDeMoedas.notasKwanzas = 3.2;

        double x = conversorDeMoedas.eurosTOkwanzasConverter(conversorDeMoedas.notasEuros, conversorDeMoedas.notasKwanzas);
        System.out.printf("Valor em Kwanzas: %.2f\n" , x);
        */

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t=================================================");
        System.out.println("==============| GENERAL CONVERTER |==============");
        System.out.println("=================================================");
        System.out.println("########## ESCOLHA UMA OPCAO:             #######");
        System.out.println("########## OPCAO 1: CONVERSOR DE MOEDAS   #######");
        System.out.println("########## OPCAO 2: CONVERSOR DE UNIDADES #######");
        System.out.println("=================================================");
        System.out.println("=================================================");
        int options = input.nextInt();

        do {
            switch (options) {
                case 1:
                    System.out.println("opcao: 1");
                    break;
                case 2:
                    System.out.println("opcao: 2");
                    break;
                default:
                    System.out.println("Opcao invalida: ");
            }
        } while (options < 3);
    }
}
