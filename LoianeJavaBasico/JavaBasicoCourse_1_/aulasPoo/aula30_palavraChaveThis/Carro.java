package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula30_palavraChaveThis;

public class Carro {
    // atributos
    String marca;
    String modelo;
    int    numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("chamando o construtor com 3 parametros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("chamando o construtor com 2 parametros");
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
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

        return this.capCombustivel * this.consumoCombustivel;
    }

    double calculaCombustivel(double km) {

        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;
    }
}
