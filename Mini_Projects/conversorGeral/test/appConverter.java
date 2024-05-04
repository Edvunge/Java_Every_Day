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

        int options;

        do {

            System.out.println("\t\t\t\t\t\t =================================================");
            System.out.println("\t\t\t\t\t\t ==============| GENERAL CONVERTER |==============");
            System.out.println("\t\t\t\t\t\t =================================================");
            System.out.println("\t\t\t\t\t\t ########## ESCOLHA UMA OPCAO:             #######");
            System.out.println("\t\t\t\t\t\t ########## OPCAO 1: CONVERSOR DE MOEDAS   #######");
            System.out.println("\t\t\t\t\t\t ########## OPCAO 2: CONVERSOR DE UNIDADES #######");
            System.out.println("\t\t\t\t\t\t =================================================");
            System.out.println("\t\t\t\t\t\t =================================================");
            options = input.nextInt();

            switch (options) {
                case 1: // OPCAO 1
                    System.out.println("opcao: 1");
                    break;
                case 2: // OPCAO 2
                    System.out.println("opcao: 2");
                    break;
                default:
                    System.out.println("Opcao invalida: ");
            }
        } while (options > 2);
    }
}
