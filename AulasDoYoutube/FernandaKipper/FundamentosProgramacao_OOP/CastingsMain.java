package AulasDoYoutube.FernandaKipper.FundamentosProgramacao_OOP;

import java.util.ArrayList;

public class CastingsMain {
    public static void main(String[] args) {
        String[] nomesArr = new String[10];
        nomesArr[0] = "Sei la meu nome";
        nomesArr[1] = "Feliz";
        nomesArr[2] = "mar";
        nomesArr[3] = "sol";
        nomesArr[4] = "lua";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Edvaldo");
        nomes.add("Maria");
        nomes.add("Edval");
        nomes.add("Ana");

        //System.out.println(nomes.get(2));

        System.out.println("\n= = = = = = = = = =  ESTOU NO FOR = = = = = = = = = =\n");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("\n= = = = = = = = = = = = = = = = = = = =\n");
        for(String nome : nomes){
            System.out.println(nome);
        }

        // CASTING
        double resultado = 0.0;
        int resultInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);
    }
}
