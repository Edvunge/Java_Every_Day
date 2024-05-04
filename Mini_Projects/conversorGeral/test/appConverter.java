package Mini_Projects.conversorGeral.test;

import Mini_Projects.conversorGeral.dominio.ConversorDeMoedas;
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

        int options, optionsMoedas;

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
                case 1: // OPCAO 1 - conversor de moedas
                    do {

                        System.out.println("==================================================");
                        System.out.println("============| CONVERSOR DE MOEDAS |===============");
                        System.out.println("==================================================");
                        System.out.println("########## ESCOLHA UMA OPCAO:      ###############");
                        System.out.println("==================================================");
                        System.out.println("## Converter de kwanza para euros  ( clique:  04 )");
                        System.out.println("## Converter de euros para kwanzas ( clique:  05 )");
                        System.out.println("## Converter de dolar para kwanzas ( clique:  06 )");
                        System.out.println("## Converter de kwanza para dolar  ( clique:  07 )");
                        System.out.println("## Converter de dolar para euros   ( clique:  08 )");
                        System.out.println("## Converter de euro para dolar    ( clique:  09 )");
                        System.out.println("## Converter de libra para euros   ( clique:  10 )");
                        System.out.println("## Converter de euros para libra   ( clique:  11 )");
                        System.out.println("## Converter de dolar para libra   ( clique:  12 )");
                        System.out.println("## Converter de libra para dolar   ( clique:  13 )");
                        System.out.println("==================================================");
                        System.out.println("==================================================");
                        optionsMoedas = input.nextInt();

                        switch (optionsMoedas) {
                            case 4:
                                System.out.println("opcao 4");
                                break;
                            case 5:
                                System.out.println("opcao 5");
                                break;
                            case 6:
                                System.out.println("opcao 6");
                                break;
                            case 7:
                                System.out.println("opcao 7");
                                break;
                            case 8:
                                System.out.println("opcao 8");
                                break;
                            case 9:
                                System.out.println("opcao 9");
                                break;
                            case 10:
                                System.out.println("opcao 10");
                                break;
                            case 11:
                                System.out.println("opcao 11");
                                break;
                            case 12:
                                System.out.println("opcao 12");
                                break;
                            case 13:
                                System.out.println("opcao 13");
                                break;
                        }
                    } while (optionsMoedas > 14);
                    break;
                case 2: // OPCAO 2 - conversor de unidades
                    System.out.println("opcao: 2");
                    break;
                default:
                    System.out.println("Opcao invalida: ");
            }
        } while (options > 2);
    }
}
