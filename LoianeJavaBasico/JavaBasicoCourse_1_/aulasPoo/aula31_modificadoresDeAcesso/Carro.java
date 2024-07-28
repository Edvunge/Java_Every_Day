package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula31_modificadoresDeAcesso;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("a autonomia do carro e: " + this.capCombustivel * this.consumoCombustivel);
    }

    double calculaCombustivel(double km) {

        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;
    }
}
