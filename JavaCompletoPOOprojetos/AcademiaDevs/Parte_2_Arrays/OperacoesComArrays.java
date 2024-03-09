package JavaCompletoPOOprojetos.AcademiaDevs.Parte_2_Arrays;

import java.util.Arrays;

public class OperacoesComArrays {
    public static void main(String[] args) {
        // OPERACOES COM ARRAYS


        // ORDENANDO UM ARRAY
        /*String[] nomes = new String[]{"rafael cosentino","jonas hirata", "marcelo martins"};
        Arrays.sort(nomes);

        for(String nome : nomes) {
            System.out.println(nome);
        }*/

        // DUPLICANDO UM ARRAY
        String[] nomes = new String[] {"rafael", "jonas","marcelo"};
        String[] nomesDuplicados = Arrays.copyOf(nomes, 10);


        // PREENCHENDO UM ARRAY
        int[] numeros = new int[10];
        java.util.Arrays.fill(numeros, 5);

    }
}
