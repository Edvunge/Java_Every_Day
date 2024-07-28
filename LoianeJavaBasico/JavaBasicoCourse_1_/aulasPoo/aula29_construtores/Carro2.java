package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula29_construtores;

public class Carro2 {
    // atributos
    String marca;
    String modelo;
    int    numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro2() {
        System.out.println("Classe Carro Foi Instanciada");
    }

    public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
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
