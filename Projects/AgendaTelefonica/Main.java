package Projects.AgendaTelefonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // <---- Seccao de Variaveis ------>
        String menu = " ";

        // criar o menu principal
        System.out.println("====================| MENU PRINCIPAL |====================");
        System.out.println("===== 1 – Adicionar registro na agenda telefônica");
        System.out.println("===== 2 – Excluir registro da agenda telefônica");
        System.out.println("===== 3 – Visualizar todos os registros");
        System.out.println("===== a – ordem alfabética");
        System.out.println("===== b – ordem numérica crescente de número de telefone");
        System.out.println("===== 4 – Pesquisa de registros");
        System.out.println("===== c – por nome");
        System.out.println("===== d – pelo primeiro nome");
        System.out.println("===== e – pelo último nome");
        System.out.println("===== t – por número de telefone");
        System.out.println("===== s – Sair");
        System.out.println("==================== ################# ====================");
        menu = input.next();

        /*
        MENU PRINCIPAL
            1 – Adicionar registro na agenda telefônica
            2 – Excluir registro da agenda telefônica
            3 – Visualizar todos os registros
            a – ordem alfabética
            b – ordem numérica crescente de número de telefone
            4 – Pesquisa de registros
            c – por nome
            d – pelo primeiro nome
            e – pelo último nome
            t – por número de telefone
            s – Sair
        */

        switch (menu) {
                case "1":
                    System.out.println("1 – Adicionar registro na agenda telefônica");
                    break;
                case "2":
                    System.out.println("2 - Excluir registro da agenda telefônica");
                    break;
                case "3":
                    System.out.println("3 – Visualizar todos os registros");
                    break;
                case "a":
                    System.out.println("a – ordem alfabética");
                    break;
                case "b":
                    System.out.println("b – ordem numérica crescente de número de telefone");
                    break;
                case "4":
                    // <----- Pesquisa de registros ----->
                    // busca por um determinado nome , numa lista de arrays
                    String names[] = {"Beach","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
                    String searchName = "Nico";
                    boolean foundName = false;

                    for(int i =0; i < names.length;i++){
                        if(names[i].equals(searchName)){
                            foundName = true;
                            break;
                        }
                    }
                    if(foundName){
                        System.out.println(searchName + " found!");
                    } else {
                        System.out.println(searchName + " not found.");
                    }
                    break;
                case "c":
                    System.out.println("c – por nome");
                    break;
                case "d":
                    System.out.println("d – pelo primeiro nome");
                    break;
                case "e":
                    System.out.println("e – pelo último nome");
                    break;
                case "t":
                    System.out.println("t – por número de telefone");
                    break;
                case "s":
                    System.out.println("s – Sair");
                    break;
                default:
                    System.out.println("saiu do default");
        }
            //
            //
        /*
        MENU PRINCIPAL
            1 – Adicionar registro na agenda telefônica
            2 – Excluir registro da agenda telefônica
            3 – Visualizar todos os registros
            a – ordem alfabética
            b – ordem numérica crescente de número de telefone
            4 – Pesquisa de registros
            c – por nome
            d – pelo primeiro nome
            e – pelo último nome
            t – por número de telefone
            s – Sair
        */
        input.close();
    }
}