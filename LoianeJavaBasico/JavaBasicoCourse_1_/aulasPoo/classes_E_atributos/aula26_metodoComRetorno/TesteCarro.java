package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.classes_E_atributos.aula26_metodoComRetorno;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro e: " + autonomia);
        System.out.println("Autonomia do carro e: " + van.obterAutonomia());
    }
}
