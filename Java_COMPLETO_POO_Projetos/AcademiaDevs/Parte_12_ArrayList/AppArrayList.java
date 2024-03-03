package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_12_ArrayList;

import java.util.ArrayList;

public class AppArrayList {
    public static void main(String[] args) {
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Vegeta";
        arrayEstatico[4] = "Bob Esponja";

        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku"); // indice 0
        arrayDinamico.add("Maria"); // indice 1
        arrayDinamico.add("Pedro"); // indice 2
        arrayDinamico.add("Vegeta"); // indice 3
        arrayDinamico.add("Bob Esponja"); // indice 4

        for (int indice = 0; indice < arrayEstatico.length; indice++) {
            System.out.println(arrayEstatico[indice]);
        }

        System.out.println("Imprimindo o ArrayList");

        for (int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }

        // revomendo um elemento do arraylist
        System.out.println("remover pedro");
        arrayDinamico.remove(2);

        for (int indice = 0; indice < arrayDinamico.size(); indice++) {
            System.out.println(arrayDinamico.get(indice));
        }

        arrayDinamico.clear(); // limpar um arraylist

        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }
    }
}
