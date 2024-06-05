package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section06_arraysCollections.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<String>();
        listaAprovados.add("ALucia");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucaas");
        listaAprovados.add("Pedros");

        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n: nums) {
            System.out.println(n);
        }
    }
}
