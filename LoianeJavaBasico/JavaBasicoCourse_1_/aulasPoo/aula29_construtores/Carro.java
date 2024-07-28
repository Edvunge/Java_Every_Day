package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula29_construtores;

public class Carro {
    // atributos
    String marca;
    String modelo;
    int    numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("Classe Carro Foi Instanciada");
    }

    // metodos
    void exibirAutonomia() {
        System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {

        System.out.println("Metodo obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {

        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
