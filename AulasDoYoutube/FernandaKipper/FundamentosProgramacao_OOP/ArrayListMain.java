package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Edvaldo");
        nomes.add("Maria");
        nomes.add("Edval");
        nomes.add("Ana");

        System.out.println(nomes.get(2));
    }
}
