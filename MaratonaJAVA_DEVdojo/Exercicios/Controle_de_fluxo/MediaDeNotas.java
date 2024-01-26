package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Scanner;

public class MediaDeNotas {
    // Média de Notas:
    //	Solicite as notas de um aluno em três disciplinas e calcule sua média.
    //	Se a média for maior que 7, aprovado; caso contrário, reprovado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite a nota de Matematica: ");
        double notaDeMatematica = sc.nextDouble();

        System.out.println("\nDigite a nota de Informatica: ");
        double notaDeInformatica = sc.nextDouble();

        System.out.println("\nDigite a nota de Quimica: \n");
        double notaDeQuimica = sc.nextDouble();

        double media = ( (notaDeInformatica + notaDeMatematica + notaDeQuimica)/3 );

        if(media > 7) {
            System.out.println("Aluno Aprovado.\n");
        } else {
            System.out.println("Aluno Reprovado.\n");
        }
        sc.close();
    }
}
