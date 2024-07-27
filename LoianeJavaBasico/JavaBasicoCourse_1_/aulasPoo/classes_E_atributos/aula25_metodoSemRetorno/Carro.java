package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.classes_E_atributos.aula25_metodoSemRetorno;

public class Carro {
    String marca;
    String modelo;
    int    numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel + " km");
    }
}
