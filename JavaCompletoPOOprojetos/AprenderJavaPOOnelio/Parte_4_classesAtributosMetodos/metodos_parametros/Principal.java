package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_4_classesAtributosMetodos.metodos_parametros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nomeAluno;
        MandaMensagem oi = new MandaMensagem();
        Scanner ent = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        nomeAluno = ent.nextLine();

        oi.mandaBoasVindas(nomeAluno);
        ent.close();
    }
}