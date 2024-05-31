package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.test;

import LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.dominio.Contato;

public class TestaContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.nome = "edvaldo";
        contato.numero = 932884933;
        contato.indicativo = "+351";
        contato.tamanho = 9;

        System.out.println("nome: " + contato.nome);
        System.out.format("numero: %s%d\n",contato.numero ,contato.indicativo);
        System.out.println("tamnho: " + contato.tamanho);
    }
}
