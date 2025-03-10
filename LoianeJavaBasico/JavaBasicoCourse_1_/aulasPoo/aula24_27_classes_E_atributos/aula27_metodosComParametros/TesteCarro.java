package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula24_27_classes_E_atributos.aula27_metodosComParametros;

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

        System.out.println();
        double qtdCombustivel10 = van.calculaCombustivel(10);
        double qtdCombustivel15 = van.calculaCombustivel(15);

        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
    }
}
